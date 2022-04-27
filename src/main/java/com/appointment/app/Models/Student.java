package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")

    @Column(name = "student_id")
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "middleName", nullable = false)
    private String middleName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mobile", nullable = false)
    private String mobile;


    @Column(name = "password", nullable = true)
    private String password;

}
