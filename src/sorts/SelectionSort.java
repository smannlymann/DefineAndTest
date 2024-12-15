package sorts;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int min  = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = min;
        }

        return arr;
    }

    public int[] failSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {

            //bug
            int minIndex = i+1;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int min  = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = min;
        }

        return arr;
    }

}
