package com.appsgeorge.Login_Registration.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.MediaSize;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {


    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private ROLE role;

    public User(String email, String password, String firstName, String lastName, ROLE role) {
        this.email=email;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.role=role;
    }
}
