package HWork6.scr;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpisokTest {
    @Test
    public void testCalculationAverageValue(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;

        double actualAverage = Spisok.calculationAverageValue(numbers);

        assertEquals(expectedAverage, actualAverage, 0.001); 
    }

    @Test
    public void testCompareAverages(){
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(4, 5, 6);
        String expectedMessage1 = "Среднее значение 1-го списка меньше среднего значения 2-ого списка.";

        List<Integer> numbers3 = Arrays.asList(1, 2, 3);
        List<Integer> numbers4 = Arrays.asList(3, 2, 1);
        String expectedMessage2 = "Средние значения списков равны.";

        assertEquals(expectedMessage1, Spisok.compareAverages(numbers1, numbers2));
        assertEquals(expectedMessage2, Spisok.compareAverages(numbers3, numbers4));
    }
}
