package sorts;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] arr) {

        if (arr.length > 1) {
            int[] left = sort(Arrays.copyOfRange(arr, 0, arr.length / 2));
            int[] right = sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
            arr = merge(left, right);
        }

        return arr;
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];

        int arr1Index = 0, arr2Index = 0, i = 0;
        while (arr1Index < arr1.length || arr2Index < arr2.length) {
            if (arr1Index >= arr1.length) {
                out[i] = arr2[arr2Index];
                arr2Index++;
                i++;
                continue;
            }

            if (arr2Index >= arr2.length) {
                out[i] = arr1[arr1Index];
                arr1Index++;
                i++;
                continue;
            }

            if (arr1[arr1Index] < arr2[arr2Index]) {
                out[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                out[i] = arr2[arr2Index];
                arr2Index++;
            }
            i++;
        }
        return out;
    }

    private int[] failMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];

        int arr1Index = 0, arr2Index = 0, i = 0;
        while (arr1Index < arr1.length || arr2Index < arr2.length) {
            if (arr1Index >= arr1.length) {
                out[i] = arr2[arr2Index];
                arr2Index++;
                continue;
            }

            if (arr2Index >= arr2.length) {
                out[i] = arr1[arr1Index];
                arr1Index++;
                continue;
            }

            if (arr1[arr1Index] < arr2[arr2Index]) {
                out[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                out[i] = arr2[arr2Index];
                arr2Index++;
            }
        }
        return out;
    }

    public int[] failSort(int[] arr) {
        if (arr.length > 1) {
            int[] left = sort(Arrays.copyOfRange(arr, 0, arr.length / 2));
            int[] right = sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
            arr = failMerge(left, right);
        }

        return arr;
    }

}
