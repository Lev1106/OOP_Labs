package practice4.bonus.interfaces.main;

import practice4.bonus.interfaces.service.CountingSort;
import practice4.problem2.Cat;
import practice4.problem2.Restaurant;
import practice4.problem2.Student;

public class Main {
    public static void main(String[] args) {
        int[] a = {6, 7, 3, 2, 4, 7, 9, 3, 6, 0, 0, 1, 1, 10, 4, 8};
        CountingSort countingSort = new CountingSort();
        int[] b = countingSort.sort(a);
        for (int i : b) System.out.print(i + " ");
    }
}
