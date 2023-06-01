package com.example.offreback.securite.dto.auth;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AuthenticationResponse {
    private Long id;
    private String nomComplet;
    private String login;

    private List<String> roles;

    private String accessToken;
}
