package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {

    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;

    private CalculatorServiceImpl out = new CalculatorServiceImpl();
    @BeforeEach
    public void setUp() {
        num1 = 5;
        num2 = 5;
        num3 = 6;
        num4 = 2;
    }

    @Test
    public void shouldReturnWelcome() {
        String result = out.welcome();
        assertTrue(result.contains("Добро пожаловать в калькулятор"));
    }

    @Test
    public void shouldReturnSumOfNums() {
        String actual1 = out.plus(num1, num2);
        String expected1 = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected1, actual1);

        String actual2 = out.plus(num3, num4);
        String expected2 = num3 + " + " + num4 + " = " + (num3 + num4);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldReturnMinusOfNums() {
        String actual1 = out.minus(num1, num2);
        String expected1 = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected1, actual1);

        String actual2 = out.minus(num3, num4);
        String expected2 = num3 + " - " + num4 + " = " + (num3 - num4);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldReturnMultiplyOfNums() {
        String actual1 = out.multiply(num1, num2);
        String expected1 = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expected1, actual1);

        String actual2 = out.multiply(num3, num4);
        String expected2 = num3 + " * " + num4 + " = " + (num3 * num4);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldReturnDivideOfNums() {
        String actual1 = out.divide(num1, num2);
        String expected1 = num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(expected1, actual1);

        String actual2 = out.divide(num3, num4);
        String expected2 = num3 + " / " + num4+ " = " + (num3 / num4);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2Equals0() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(num1, 0));
    }

}
