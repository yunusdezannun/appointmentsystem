package com.appointment.app.Service;

import com.appointment.app.Repository.CaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaseService {

    @Autowired
    private CaseRepository CaseRepo;
}
