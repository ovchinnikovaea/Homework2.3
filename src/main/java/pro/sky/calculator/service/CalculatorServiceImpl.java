package pro.sky.calculator.service;
import org.springframework.stereotype.Service;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает данных для вычисления, введите значения";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает данных для вычисления, введите значения";
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает данных для вычисления, введите значения";
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает данных для вычисления, введите значения";
        } else if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}

