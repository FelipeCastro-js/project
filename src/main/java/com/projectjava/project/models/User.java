package com.projectjava.project.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "firstName")
    private String firstName;

    @Getter @Setter @Column(name = "lastName")
    private String lastName;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "cellphone")
    private String cellphone;




}
