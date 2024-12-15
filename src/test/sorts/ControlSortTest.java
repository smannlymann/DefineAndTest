package test.sorts;

import specifications.IntSortSpecification;
import org.junit.Assert;
import org.junit.Test;
import sorts.ControlSort;

public class ControlSortTest {

    private IntSortSpecification intSortSpecification;
    private ControlSort controlSort;

    public ControlSortTest() {
        intSortSpecification = new IntSortSpecification();
        controlSort = new ControlSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), controlSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortSpecification.getTestInputs();
        int[][] controlSortTestInputs = intSortSpecification.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortSpecification.sort(intSortTestInputs[i]), controlSort.failSort(controlSortTestInputs[i]));
        }
    }
}
