package com.anons.api.models.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginForm {
    @NotBlank
    @Size(min = 3, max = 120)
    private String username;

    @NotBlank
    @Size(min = 3, max = 255)
    private String password;
}
