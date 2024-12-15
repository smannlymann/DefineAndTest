package test.sorts;

import specifications.IntSortSpecification;
import org.junit.Assert;
import org.junit.Test;
import sorts.MergeSort;

public class MergeSortTest {

    private IntSortSpecification intSortSpecification;
    private MergeSort mergeSort;

    public MergeSortTest() {
        intSortSpecification = new IntSortSpecification();
        mergeSort = new MergeSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), mergeSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), mergeSort.failSort(controlSortTestInputs[i]));
        }
    }
}
