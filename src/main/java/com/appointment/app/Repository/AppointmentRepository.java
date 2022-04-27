package com.appointment.app.Repository;

import com.appointment.app.Models.Appointment;
import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
