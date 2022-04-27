package com.appointment.app.Repository;

import com.appointment.app.Models.Professional;
import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<Professional, Integer> {
}
