package com.appointment.app.Service;

import com.appointment.app.Models.Professional;
import com.appointment.app.Repository.ProfessionalRepository;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProfessionalService {

    @Autowired
    private ProfessionalRepository professionalRepo;

	public Professional newProf(Professional professional) {
		// TODO Auto-generated method stub
		return professionalRepo.save(professional);
	}
}
