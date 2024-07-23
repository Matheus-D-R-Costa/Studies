package dio.spring_security_jwt.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserDto(@NotBlank String username, @NotBlank String password) {}
