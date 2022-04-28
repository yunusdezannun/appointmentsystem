package com.appointment.app.Service;

import com.appointment.app.Repository.AssignmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AssignmentService {

    @Autowired
    private AssignmentRepository AssignmentRepo;
}
