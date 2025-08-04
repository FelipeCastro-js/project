package com.projectjava.project.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
    private Long id;

     @Column(name = "first_name")
    private String firstName;

     @Column(name = "last_name")
    private String lastName;

     @Column(name = "email")
    private String email;

     @Column(name = "password")
    private String password;

     @Column(name = "cellphone")
    private String cellphone;




}
