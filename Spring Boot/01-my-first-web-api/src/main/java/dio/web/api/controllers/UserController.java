package dio.web.api.controllers;


import dio.web.api.dtos.UserDto;
import dio.web.api.models.UserModel;
import dio.web.api.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }

    @GetMapping("/{username}")
    public ResponseEntity<Object> getOneUserByUsername(@PathVariable("username") String username) {
        Optional<UserModel> userModelOptional = userService.getUserByUsername(username);

        if (!userModelOptional.isPresent()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Username not found");

        return ResponseEntity.status(HttpStatus.OK).body(userModelOptional.get());
    }

    @PostMapping
    public ResponseEntity<UserModel> postOneUser(@RequestBody @Valid UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.postUser(userDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUserById(@PathVariable("id") Integer id, @RequestBody @Valid UserDto userDto) {
        Optional<UserModel> updatedUser = userService.updateUser(id, userDto);

        if (!updatedUser.isPresent()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found.");

        return ResponseEntity.ok(updatedUser.get());
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

}
