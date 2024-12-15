package definitions;

import java.util.Arrays;

public class IntSortDefinition {

    public int[] sort(int[] arr) {
        //we want functional semantics here
        int[] out = Arrays.copyOf(arr, arr.length);

        for (int j = 1; j < out.length; j++) {
            int key = out[j];
            int i = j - 1;
            while (i >= 0 && out[i] > key) {
                out[i+1] = out[i];
                i--;
            }
            out[i+1] = key;
        }

        return out;
    }
    
    public int[][] getTestInputs(){
        return new int[][]{
                {1, 4, 2},
                {},
                {4, 2, 1},
                {1, 4, 2, 1, 3},
                {1, 4, 2, 0, 3, 5},
                {1, 4, -2, 0, 3, -5}
        };
    }

    public int[][] getTestOutputs(){
        return new int[][]{
                {1, 2, 4},
                {},
                {1, 2, 4},
                {1, 1, 2, 3, 4},
                {0, 1, 2, 3, 4, 5},
                {-5, -2, 0, 1, 3, 4}
        };
    }
}
