package com.appointment.app.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.OnDelete;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cases")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "case_id")
    private Long case_id;

//    @Column(name = "student_id", nullable = false)
//    private String student_id;
//
//    @Column(name = "prof_id", nullable = false)
//    private String prof_id;

    @Column(name = "discript", nullable = false)
    private String discript;

    @Column(name = "status", nullable = false)
    private String status;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student studentCase;
    
    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "prof_id", referencedColumnName="prof_id", insertable=false,updatable=false,nullable=false)
    @OnDelete(action=OnDeleteAction.CASCADE)
    private Professional professional;
}
