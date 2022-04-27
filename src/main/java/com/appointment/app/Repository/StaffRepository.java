package com.appointment.app.Repository;

import com.appointment.app.Models.Staff;
import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {


}
