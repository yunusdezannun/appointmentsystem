package com.appointment.app.Service;

import com.appointment.app.Repository.AssignmentRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AssignmentService {

    @Autowired
    private final AssignmentRepository AssignmentRepo;
}
