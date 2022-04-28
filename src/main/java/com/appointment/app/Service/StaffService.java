package com.appointment.app.Service;

import com.appointment.app.Models.Staff;
import com.appointment.app.Repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StaffService {

    @Autowired
    private StaffRepository staffRepo;

    public Staff newStaff(Staff staff) {
        return staffRepo.save(staff);
    }

}
