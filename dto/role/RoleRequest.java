package com.example.offreback.securite.dto.role;


import com.example.offreback.securite.models.Role;
import lombok.*;

import java.util.Set;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class RoleRequest {
    private Set<Role> roles;
}
