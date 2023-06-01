package com.example.offreback.securite.dto.role;

import com.example.offreback.securite.enums.Roles;
import lombok.*;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class RoleResponse {

    private Long id;
    private Roles name;
}
