package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "professional")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prof_id_seq")

    @Column(name = "prof_id")
    private Long id;

    @Column(name = "prof_name", nullable = false)
    private String prof_name;


}
