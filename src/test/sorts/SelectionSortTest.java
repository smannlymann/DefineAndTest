package test.sorts;

import specifications.IntSortSpecification;
import org.junit.Assert;
import org.junit.Test;
import sorts.SelectionSort;

public class SelectionSortTest {

    private IntSortSpecification intSortSpecification;
    private SelectionSort selectionSort;

    public SelectionSortTest() {
        intSortSpecification = new IntSortSpecification();
        selectionSort = new SelectionSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), selectionSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), selectionSort.failSort(controlSortTestInputs[i]));
        }
    }
}
