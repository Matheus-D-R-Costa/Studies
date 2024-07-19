package dio.web.api.services;

import dio.web.api.dtos.UserDto;
import dio.web.api.handlers.BusinessException;
import dio.web.api.handlers.EmptyFieldException;
import dio.web.api.models.UserModel;
import dio.web.api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserModel> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserModel postUser(UserDto userDto) {
        UserModel userModel = new UserModel(userDto.username(), userDto.password());
        return userRepository.save(userModel);
    }

    public Optional<UserModel> updateUser(Integer id,UserDto userDto) {

        if (userDto.username().equals("Malcon")) throw new EmptyFieldException("username");

        UserModel userModel = new UserModel(userDto.username(), userDto.password());
        return userRepository.update(id, userModel);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

}
