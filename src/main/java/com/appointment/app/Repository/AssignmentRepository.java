package com.appointment.app.Repository;

import com.appointment.app.Models.Assignment;
import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
}
