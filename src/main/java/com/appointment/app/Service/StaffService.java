package com.appointment.app.Service;

import com.appointment.app.Models.Staff;
import com.appointment.app.Models.Student;
import com.appointment.app.Repository.StaffRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StaffService {

    @Autowired
    private final StaffRepository staffRepo;

    public Staff newStaff(Staff staff) {
        return StaffRepository.save(staff);
    }

}
