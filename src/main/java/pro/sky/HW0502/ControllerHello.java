package pro.sky.HW0502;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {
    private final ServiceCalculator serviceCalculator;

    public ControllerHello(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }


    @GetMapping(path = "/calculator")
    public String getHello () {
        return serviceCalculator.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String getAddition (@RequestParam("num1") int num1, @RequestParam("num2") int num2){


        serviceCalculator.getAddition(num1, num2);
        String result = num1 + " + " + num2 + " = " + (num1 + num2);
        System.out.println(result);
        return result;
    }


    @GetMapping(path = "/calculator/minus")
    public String getSubtraction (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        serviceCalculator.getSubtraction(num1, num2);
        String result = num1 + " - " + num2 + " = " + (num1 - num2);
        System.out.println(result);
        return result;
    }


    @GetMapping(path = "/calculator/multiply")
    public String getMultiplication (@RequestParam("num1") int num1, @RequestParam("num2") int num2){

      serviceCalculator.getMultiplication(num1, num2);
        String result = num1 + " * " + num2 + " = " + (num1 * num2);
        System.out.println(result);
        return result;
    }
    @GetMapping(path = "/calculator/divide")
    public String getDivision (@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        serviceCalculator.getDivision(num1, num2);
        if (num2 == 0) {
            return "Деление 0 запрещено";
        }
        String result = num1 + " / " + num2 + " = " + (num1 / num2);
        System.out.println(result);
        return result;
    }
}
