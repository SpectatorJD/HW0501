package pro.sky.HW0502;


import org.springframework.stereotype.Service;


@Service

public class ServiceCalculator {
    public String hello;

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }


    public int getAddition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int getSubtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int getMultiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int getDivision(int num1, int num2) {
        int result = num1 / num2;
            return result;
        }

    }



