package practice4.bonus.interfaces.service;
import practice4.bonus.interfaces.model.Sortable;

public class CountingSort implements Sortable {
    @Override
    public int[] sort(int[] a) {
        int[] b = new int[a.length];
        int[] cnt = new int[11];
        for (int i = 0; i < a.length; i++) cnt[a[i]]++;
        int k = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < cnt[i]; j++) b[k++] = i;
        }
        return b;
    }
}
