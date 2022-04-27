package com.appointment.app.Service;

import com.appointment.app.Repository.ProfessionalRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProfessionalService {

    @Autowired
    private final ProfessionalRepository ProfessionalRepo;
}
