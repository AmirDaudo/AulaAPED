public class TorreHanoi {
    private static void hanoi(int disco, char origem, char auxiliar, char destino) {
        if (disco > 0) {
            hanoi(disco - 1, origem, destino, auxiliar);
            System.out.printf("Mover de %c para %c\n", origem, destino);
            hanoi(disco - 1, auxiliar, origem, destino);
        }
    }

    public static void main(String[] args) {
        int disco = 3;
        hanoi(disco, 'A', 'B', 'C');
    }
}
