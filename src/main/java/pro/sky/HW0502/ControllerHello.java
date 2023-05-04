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

        return serviceCalculator.getAddition(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String getSubtraction (@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        return serviceCalculator.getSubtraction(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String getMultiplication (@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        return serviceCalculator.getMultiplication(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String getDivision (@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        return serviceCalculator.getDivision(num1, num2);
    }
}
