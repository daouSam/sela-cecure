package com.example.offreback.securite.dto.utilisateur;


import com.example.offreback.securite.models.Role;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UtilisateurResponse {
    private Long id;
    private String nomComplet;
    private String login;
    private Set<Role> roles;

}
