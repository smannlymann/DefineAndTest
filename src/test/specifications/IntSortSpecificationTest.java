package test.specifications;

import specifications.IntSortSpecification;
import org.junit.Assert;
import org.junit.Test;

public class IntSortSpecificationTest {
    private IntSortSpecification intSortSpecification;

    public IntSortSpecificationTest() {
        intSortSpecification = new IntSortSpecification();
    }

    @Test
    public void _testInputsSortCorrectly() {
        int[][] testInputs = this.intSortSpecification.getTestInputs();
        int[][] testOutputs = this.intSortSpecification.getTestOutputs();

        for (int i = 0; i < testInputs.length; i++) {
            Assert.assertArrayEquals(this.intSortSpecification.sort(testInputs[i]), testOutputs[i]);
        }
    }
}
