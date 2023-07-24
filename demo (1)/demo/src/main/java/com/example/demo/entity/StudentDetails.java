package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")

public class StudentDetails {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    private String gender;

    private String address;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private StudentLogin studentLogin;
}
