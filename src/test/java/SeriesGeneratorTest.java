import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class SeriesGeneratorTest {
    @Test
    public void testShouldGenerateASeriesForAgivenNumber() throws Exception {
        SeriesGenerator seriesGenerator = new SeriesGenerator(6);
        int[] expectedSeries = new int[6];
        expectedSeries[0] = 0;
        expectedSeries[1] = 1;
        expectedSeries[2] = 1;
        expectedSeries[3] = 2;
        expectedSeries[4] = 3;
        expectedSeries[5] = 5;

        assertTrue(Arrays.equals(expectedSeries, seriesGenerator.generateSeries()));
    }

    @Test
    public void testShouldGenerateASeriesForAgivenNumber10() throws Exception {
        SeriesGenerator seriesGenerator = new SeriesGenerator(10);
        int[] expectedSeries = new int[10];
        expectedSeries[0] = 0;
        expectedSeries[1] = 1;
        expectedSeries[2] = 1;
        expectedSeries[3] = 2;
        expectedSeries[4] = 3;
        expectedSeries[5] = 5;
        expectedSeries[6] = 8;
        expectedSeries[7] = 13;
        expectedSeries[8] = 21;
        expectedSeries[9] = 34;

        assertTrue(Arrays.equals(expectedSeries, seriesGenerator.generateSeries()));
    }
}
