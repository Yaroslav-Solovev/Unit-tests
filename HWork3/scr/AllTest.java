
import org.junit.Test;

public class AllTest{
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    @Test
    public void test(){
        FindNum findNum1 = new FindNum();
        if (findNum1.evenOddNumber(5) == true)
            throw new AssertionError("Метод работает верно!");
    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
        FindNum findNum2 = new FindNum();
            if (findNum2.numberInInterval(35) == true)
                throw new AssertionError("Метод работает верно!");
    
    }
}
