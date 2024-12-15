import definitions.IntSortDefinition;
import sorts.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SelectionSort intSortDefinition = new SelectionSort();

        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{1, 4, 2})));
        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{})));
        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{4, 2, 1})));
        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{1, 4, 2, 1, 3})));
        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{1, 4, 2, 0, 3, 5})));
        System.out.println(Arrays.toString(intSortDefinition.sort(new int[]{1, 4, -2, 0, 3, -5})));

        System.out.println("Done!");
    }
}