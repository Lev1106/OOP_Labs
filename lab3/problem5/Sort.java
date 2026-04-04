package lab3.problem5;


public class Sort {
    static <E> void swap(E [] array, int i, int j) {
        E array_i = array[i];
        array[i] = array[j];
        array[j] = array_i;
    }
    static <E extends Comparable<E>> void bubbleSort(E [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
    static <E extends Comparable<E>> void selectionSort(E [] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[k]) < 0) k = j;
            }
            swap(array, i, k);
        }
    }
}
