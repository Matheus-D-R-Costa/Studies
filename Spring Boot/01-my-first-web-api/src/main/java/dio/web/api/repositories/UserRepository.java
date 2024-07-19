package dio.web.api.repositories;

import dio.web.api.models.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    // Database de simulação
    private List<UserModel> fakeDatabase = new ArrayList<>(Arrays.asList(
            new UserModel("Carlos", "macaco123"),
            new UserModel("Lamine Yamal", "NeymarLover11")
    ));

    public UserModel save(UserModel user) {
        fakeDatabase.add(user);
        System.out.println("[DATABASE]: Usuário salvo com sucesso.");
        return user;
    }

    public Optional<UserModel> update(Integer id, UserModel updatedUser) {
        Optional<UserModel> userToUpdate = fakeDatabase.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();

        if (userToUpdate.isPresent()) {
            UserModel existingUser = userToUpdate.get();

            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getUsername());

            System.out.println("[DATABASE]: Usuário atualizado com sucesso.");
            return Optional.of(existingUser);
        } else {
            System.out.println("[DATABASE]: Usuário não encontrado.");
            return Optional.empty();
        }
    }

    public void deleteById(Integer id) {
        Optional<UserModel> userToDelete = fakeDatabase.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();

        if (userToDelete.isPresent()) {
            fakeDatabase.remove(userToDelete.get());
            System.out.println("[DATABASE]: Usuário removido com sucesso.");
        } else {
            System.out.println("[DATABASE]: Usuário não encontrado.");
        }
    }

    public List<UserModel> findAll() {
        return new ArrayList<>(fakeDatabase);
    }

    public Optional<UserModel> findById(Integer id) {
        return fakeDatabase.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public Optional<UserModel> findByUsername(String username) {
        return fakeDatabase.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
    }
}
