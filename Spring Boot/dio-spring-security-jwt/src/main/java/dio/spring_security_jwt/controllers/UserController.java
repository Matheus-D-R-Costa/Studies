package dio.spring_security_jwt.controllers;

import dio.spring_security_jwt.dtos.UserDto;
import dio.spring_security_jwt.models.UserModel;
import dio.spring_security_jwt.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to my JWT securityApp";
    }

    @PostMapping
    public ResponseEntity<UserModel> postUser(UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userDto));
    }

}
