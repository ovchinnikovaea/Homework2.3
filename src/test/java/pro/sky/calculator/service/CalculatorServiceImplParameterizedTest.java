package pro.sky.calculator.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {


    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {

        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(3, 2),
                Arguments.of(12, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnSumOfNums(int num1, int num2) {
        String actual = out.plus(num1, num2);
        String expected = num1 + " + " + num2 + " = " + (num1 + num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnMinusOfNums(int num1, int num2) {
        String actual = out.minus(num1, num2);
        String expected = num1 + " - " + num2 + " = " + (num1 - num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnMultiplyOfNums(int num1, int num2) {
        String actual = out.multiply(num1, num2);
        String expected = num1 + " * " + num2 + " = " + (num1 * num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnDivideOfNums(int num1, int num2) {
        String actual = out.divide(num1, num2);
        String expected = num1 + " / " + num2 + " = " + (num1 / num2);
        Assertions.assertEquals(expected, actual);
    }

}
