import specifications.IntSortSpecification;
import sorts.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        IntSortSpecification intSort = new IntSortSpecification();

        int[][] sample = intSort.getRandomTestInputs();

        for (int [] row : sample ) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(Arrays.toString(quickSort.sort(new int[]{1, 4, 2})));
        System.out.println(Arrays.toString(quickSort.sort(new int[]{})));
        System.out.println(Arrays.toString(quickSort.failSort(new int[]{4, 2, 1})));
        System.out.println(Arrays.toString(quickSort.sort(new int[]{1, 4, 2, 1, 3})));
        System.out.println(Arrays.toString(quickSort.sort(new int[]{1, 4, 2, 0, 3, 5})));
        System.out.println(Arrays.toString(quickSort.sort(new int[]{1, 4, -2, 0, 3, -5})));

        System.out.println("Done!");
    }
}