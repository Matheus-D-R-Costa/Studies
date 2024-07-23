package dio.spring_security_jwt.repositories;

import dio.spring_security_jwt.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    Optional<UserModel> findByUsername(String username);

}
