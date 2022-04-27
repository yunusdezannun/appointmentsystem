package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "assignment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assign_id_seq")

    @Column(name = "assign_id")
    private Long id;

    @Column(name = "cases", nullable = false)
    private String cases;

    @Column(name = "staff", nullable = false)
    private String staff;

    @Column(name = "status", nullable = false)
    private String status;

}
