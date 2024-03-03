import java.util.Arrays;

public class Aula4 {
    public static void Ordenar_select(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 5, 4, 2};
        Ordenar_select(array);
    }
}
