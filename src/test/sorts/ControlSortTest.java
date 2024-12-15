package test.sorts;

import definitions.IntSortDefinition;
import org.junit.Assert;
import org.junit.Test;
import sorts.ControlSort;

public class ControlSortTest {

    private IntSortDefinition intSortDefintion;
    private ControlSort controlSort;

    public ControlSortTest() {
        intSortDefintion = new IntSortDefinition();
        controlSort = new ControlSort();
    }

    @Test
    public void _testSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), controlSort.sort(controlSortTestInputs[i]));
        }
    }

    @Test
    public void _testFailSortSatisfiesDefinition()
    {
        // Initialize clean, separate inputs to ensure mutability doesn't affect the tests
        int[][] intSortTestInputs = intSortDefintion.getTestInputs();
        int[][] controlSortTestInputs = intSortDefintion.getTestInputs();

        for(int i = 0; i < intSortTestInputs.length; i++) {
            Assert.assertArrayEquals(intSortDefintion.sort(intSortTestInputs[i]), controlSort.failSort(controlSortTestInputs[i]));
        }
    }
}
