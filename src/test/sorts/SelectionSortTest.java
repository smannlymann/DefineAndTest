package test.sorts;

import definitions.IntSortDefinition;
import org.junit.Assert;
import org.junit.Test;
import sorts.SelectionSort;

public class SelectionSortTest {

    private IntSortDefinition intSortDefintion;
    private SelectionSort selectionSort;

    public SelectionSortTest() {
        intSortDefintion = new IntSortDefinition();
        selectionSort = new SelectionSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), selectionSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), selectionSort.failSort(controlSortTestInputs[i]));
        }
    }
}
