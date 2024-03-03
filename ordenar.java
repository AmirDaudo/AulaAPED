import java.util.Arrays;

class Ordenar {

    public static void ordenacao(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 4, 2,};

        ordenacao(array);

        System.out.println("Array depois da ordenação:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
