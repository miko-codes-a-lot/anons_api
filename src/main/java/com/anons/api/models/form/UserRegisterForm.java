package com.anons.api.models.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserRegisterForm extends UserLoginForm {
    @NotBlank
    @Size(min = 3, max = 255)
    private String email;

    @NotBlank
    @Size(min = 5, max = 15)
    @Pattern(regexp = "^\\+[1-9]\\d{1,14}$")
    private String phoneNumber;
}
