package test.sorts;

import definitions.IntSortDefinition;
import org.junit.Assert;
import org.junit.Test;
import sorts.MergeSort;

public class MergeSortTest {

    private IntSortDefinition intSortDefintion;
    private MergeSort mergeSort;

    public MergeSortTest() {
        intSortDefintion = new IntSortDefinition();
        mergeSort = new MergeSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), mergeSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), mergeSort.failSort(controlSortTestInputs[i]));
        }
    }
}
