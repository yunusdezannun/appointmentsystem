package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "staff")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_id_seq")

    @Column(name = "staff_id")
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

    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "password", nullable = true)
    private String password;

}
