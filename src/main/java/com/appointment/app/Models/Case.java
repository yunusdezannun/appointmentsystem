package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "case")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "case_id_seq")

    @Column(name = "case_id")
    private Long id;

    @Column(name = "student", nullable = false)
    private String student;

    @Column(name = "professional", nullable = false)
    private String middleName;

    @Column(name = "discript", nullable = false)
    private String discript;

    @Column(name = "status", nullable = false)
    private String status;

}
