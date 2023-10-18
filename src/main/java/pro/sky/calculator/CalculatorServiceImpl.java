package pro.sky.calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
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
            return "Делить на ноль нельзя!";
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}

