package com.appointment.app.Repository;

import com.appointment.app.Models.Case;
import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Integer> {
}
