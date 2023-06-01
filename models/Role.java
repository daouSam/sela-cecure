package com.example.offreback.securite.models;



import com.example.offreback.securite.enums.Roles;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Roles name;


    public Role(Roles name) {
        this.name = name;
    }
}
