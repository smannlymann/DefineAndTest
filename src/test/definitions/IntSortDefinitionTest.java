package test.definitions;

import definitions.IntSortDefinition;
import org.junit.Assert;
import org.junit.Test;

public class IntSortDefinitionTest {
    private IntSortDefinition intSortDefintion;

    public IntSortDefinitionTest() {
        intSortDefintion = new IntSortDefinition();
    }

    @Test
    public void _testInputsSortCorrectly() {
        int[][] testInputs = this.intSortDefintion.getTestInputs();
        int[][] testOutputs = this.intSortDefintion.getTestOutputs();

        for (int i = 0; i < testInputs.length; i++) {
            Assert.assertArrayEquals(this.intSortDefintion.sort(testInputs[i]), testOutputs[i]);
        }
    }
}
