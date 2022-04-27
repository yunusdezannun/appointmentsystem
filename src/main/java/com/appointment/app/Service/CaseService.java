package com.appointment.app.Service;

import com.appointment.app.Repository.CaseRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaseService {

    @Autowired
    private final CaseRepository CaseRepo;
}
