public class Aula4_1 {
        public static void OrdenarRecursivamente(int[] array, int n) {
            if (n <= 1) {
                return;
            }
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            OrdenarRecursivamente(array, n - 1);
        }

        public static void main(String[] args) {
            int[] array = {9, 3, 7, 5, 4, 2};

            OrdenarRecursivamente(array, array.length);

            System.out.println("Array depois da ordenação:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

