package com.appointment.app.Controller;

import com.appointment.app.Models.Student;
import com.appointment.app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Appoitnment/Appoint")
@CrossOrigin(origins  = " * ")
public class AppointmentController {

    @Autowired
    private StudentService studentService;

    @PostMapping

    @RequestMapping(value = "/newStudent", method = RequestMethod.POST,headers = "Accept= application/json")

    public ResponseEntity<?> newStudent (@RequestBody Student student) {
        try{
            return new ResponseEntity<Student>(this.studentService.newStudent(student), HttpStatus.OK);
        }
        catch (RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT );
        }
    }
}
