package test.sorts;

import specifications.IntSortSpecification;
import org.junit.Assert;
import org.junit.Test;
import sorts.QuickSort;

public class QuickSortTest {

    private IntSortSpecification intSortSpecification;
    private QuickSort quickSort;

    public QuickSortTest() {
        intSortSpecification = new IntSortSpecification();
        quickSort = new QuickSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), quickSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), quickSort.failSort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testSortSatisfiesDefinitionWithRandomInputs()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getRandomTestInputs();
        int[][] controlSortTestInputs = new int[intSortTestInputs.length][];

        int j = 0;
        for (int[] row : intSortTestInputs) {
            controlSortTestInputs[j] = row.clone();
            j++;
        }

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), quickSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinitionWithRandomInputs()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getRandomTestInputs();
        int[][] controlSortTestInputs = new int[intSortTestInputs.length][];

        int j = 0;
        for (int[] row : intSortTestInputs) {
            controlSortTestInputs[j] = row.clone();
            j++;
        }

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), quickSort.failSort(controlSortTestInputs[i]));
        }
    }
}
