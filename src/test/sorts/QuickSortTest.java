package test.sorts;

import definitions.IntSortDefinition;
import org.junit.Assert;
import org.junit.Test;
import sorts.QuickSort;

import java.util.Arrays;

public class QuickSortTest {

    private IntSortDefinition intSortDefintion;
    private QuickSort quickSort;

    public QuickSortTest() {
        intSortDefintion = new IntSortDefinition();
        quickSort = new QuickSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), quickSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), quickSort.failSort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testSortSatisfiesDefinitionWithRandomInputs()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getRandomTestInputs();
        int[][] controlSortTestInputs = new int[intSortTestInputs.length][];

        int j = 0;
        for (int[] row : intSortTestInputs) {
            controlSortTestInputs[j] = row.clone();
            j++;
        }

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), quickSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinitionWithRandomInputs()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getRandomTestInputs();
        int[][] controlSortTestInputs = new int[intSortTestInputs.length][];

        int j = 0;
        for (int[] row : intSortTestInputs) {
            controlSortTestInputs[j] = row.clone();
            j++;
        }

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), quickSort.failSort(controlSortTestInputs[i]));
        }
    }
}
