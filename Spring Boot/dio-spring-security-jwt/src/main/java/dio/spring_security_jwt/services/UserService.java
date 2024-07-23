package dio.spring_security_jwt.services;

import dio.spring_security_jwt.dtos.UserDto;
import dio.spring_security_jwt.models.UserModel;
import dio.spring_security_jwt.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public UserModel createUser(UserDto userDto) {
        UserModel user = new UserModel();

        user.setUsername(userDto.username());
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

}
