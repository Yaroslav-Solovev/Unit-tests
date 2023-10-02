package HWork1;

import org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testCalculatateDiscount(){
        Calculator calculator = new Calculator();
        // тест №1 проверка корректного расчета скидки
        double result1 = calculator.calculateDiscount(100,10);
        assertThat(result1).isEqualTo(90);
        // тест №2 проверка расчета скидки для суммы покупки равной 0
        double result2 = calculator.calculateDiscount(0,20);
        assertThat(result1).isEqualTo(0);
        // тест №3 проверка выброса исключения при отрицательном сумме покупки (result)
        assertThatThrowBy(() -> calculator.calculateDiscount(-43,30))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
        // тест №4 проверка выброса исключения при отрицательном проценте скидки
        assertThatThrowBy(() -> calculator.calculateDiscount(123,-5))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
        // тест №5 проверка выброса исключения при проценте скидки больше 100
        assertThatThrowBy(() -> calculator.calculateDiscount(345,150))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
    }
}
