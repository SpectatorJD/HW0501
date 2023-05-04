package pro.sky.HW0502;


import org.springframework.stereotype.Service;


@Service

public class ServiceCalculator {
    public String hello;

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }


    public String getAddition(int num1, int num2) {
        String result = num1 + " + " + num2 + " = " + (num1 + num2);
        System.out.println(result);
        return result;
    }

    public String getSubtraction(int num1, int num2) {
        String result = num1 + " - " + num2 + " = " + (num1 - num2);
        System.out.println(result);
        return result;
    }

    public String getMultiplication(int num1, int num2) {
        String result = num1 + " * " + num2 + " = " + (num1 * num2);
        System.out.println(result);
        return result;
    }

    public String getDivision(int num1, int num2) {
        if (num2 == 0) {
            return "Деление 0 запрещено";
        }
            String result = num1 + " / " + num2 + " = " + (num1 / num2);
            System.out.println(result);
            return result;
        }
    }



