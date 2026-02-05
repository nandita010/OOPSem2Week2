package ie.atu.week1.sem2week2;

import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    @RequestMapping
    public Object Calculate(@RequestParam double num1,
                           @RequestParam Double num2,
                           @RequestParam String operation) {

        Double result;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;

            default:
                return "Invalid operation";
        }
        return result;
    }

}