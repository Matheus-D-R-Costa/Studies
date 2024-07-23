package dio_spring_security.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
public class UserModel implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(name = "UsersRoles",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    private List<RoleModel> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream()
                .map(role -> (GrantedAuthority) role)
                .collect(Collectors.toList());
    }


    @Override
    public boolean isAccountNonExpired() {
        return true; // Ou qualquer outra lógica necessária
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Ou qualquer outra lógica necessária
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Ou qualquer outra lógica necessária
    }

    @Override
    public boolean isEnabled() {
        return true; // Ou qualquer outra lógica necessária
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
