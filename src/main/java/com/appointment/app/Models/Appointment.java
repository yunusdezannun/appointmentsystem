package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "appointment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appoint_id_seq")

    @Column(name = "appoint_id")
    private Long id;

    @Column(name = "cases", nullable = false)
    private String cases;

    @Column(name = "staff", nullable = false)
    private String staff;
}
