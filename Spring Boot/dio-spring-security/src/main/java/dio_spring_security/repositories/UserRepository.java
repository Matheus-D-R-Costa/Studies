package dio_spring_security.repositories;

import dio_spring_security.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    Optional<UserModel> findByUsername(String username);

}
