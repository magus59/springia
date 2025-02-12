package com.yahia.usersservice.entities;

import com.yahia.usersservice.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    @PrePersist
    protected void setDefaultRole() {
        if (this.role == null) {
            this.role = Role.USER;
        }
    }
}
