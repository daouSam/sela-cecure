package com.example.offreback.securite.dto.auth;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AuthenticationRequest {
    private String login;
    private String password;
}
