package dio_spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    @GetMapping
    public String welcome() {
        return "Welcome to my securityApp";
    }

    @GetMapping("/users")
    public String users() {
        return "Authorized User";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized Manager";
    }


}
