package ie.atu.week1.sem2week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return"Hello World";
    }
@GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) //scans path of url
    {
        return "Hello" + " " + name;
    }
@GetMapping ("/details")
    public String details(@RequestParam String name, @RequestParam Integer age)
    {
        return "Hello"  + " " + name + " " + age;
    }
    @GetMapping("/person") //JACKSON converts Java classes to JSON
    public Person getPerson(){
        Person person= new Person("Nandita", 20);
        return person;
    }
}
