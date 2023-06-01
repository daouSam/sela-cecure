package com.example.offreback.securite.repositories;



import com.example.offreback.securite.enums.Roles;
import com.example.offreback.securite.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(Roles name);

}
