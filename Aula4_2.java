public class Aula4_2 {
    public static void Ordenar(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = (i + 1); j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int aux = array[min];
            array[min] = array[i];
            array[i] = aux;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 4, 2};
        Ordenar(array);
    }
}




