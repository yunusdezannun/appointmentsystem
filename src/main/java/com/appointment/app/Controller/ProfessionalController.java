package com.appointment.app.Controller;

import com.appointment.app.Models.Professional;
import com.appointment.app.Models.Student;
import com.appointment.app.Service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Appoitnment/Prof")
@CrossOrigin(origins  = " * ")
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @PostMapping

    @RequestMapping(value = "/newProfession", method = RequestMethod.POST,headers = "Accept= application/json")

    public ResponseEntity<?> newProf (@RequestBody Professional professional) {
        try{
            return new ResponseEntity<Professional>(this.professionalService.newProf(professional), HttpStatus.OK);
        }
        catch (RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT );
        }
    }
}
