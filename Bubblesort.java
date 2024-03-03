
    import java.util.Arrays;

    class Bubblesort {

        public static void ordenacao(int[] array, int n) {
            if (n == 1) {
                return;
            }
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            ordenacao(array, n - 1);
        }

        public static void main(String[] args) {
            int[] array = {9, 3, 7, 5, 4, 2};

            ordenacao(array, array.length);

            System.out.println("forma recursiva:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

