package com.appointment.app.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "professional")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professional {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "prof_id")
    private Long prof_id;

    @Column(name = "prof_name", nullable = false)
    private String prof_name;
    
    @OneToMany(mappedBy = "professional", fetch = FetchType.LAZY)
    private Set<Case> cases;

}
