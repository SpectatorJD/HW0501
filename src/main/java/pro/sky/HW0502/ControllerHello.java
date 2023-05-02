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
    public int getAddition (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return serviceCalculator.getAddition(num1, num2);
    }
}
