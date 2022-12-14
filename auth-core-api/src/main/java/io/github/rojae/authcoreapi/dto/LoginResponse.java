package io.github.rojae.authcoreapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private String email;
    private String name;
    private String platformType;
    private String profileImage;
}
