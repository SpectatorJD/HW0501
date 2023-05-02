package pro.sky.HW0502;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service

public class ServiceCalculator {
    public String hello;

    public String hello () {
        return "Добро пожаловать в калькулятор";
    }


    public int getAddition (int num1, int num2){
        return num1 + num2 ;
    }
    }

