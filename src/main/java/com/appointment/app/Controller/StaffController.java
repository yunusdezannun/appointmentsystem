package com.appointment.app.Controller;

import com.appointment.app.Models.Staff;
import com.appointment.app.Models.Student;
import com.appointment.app.Service.StaffService;
import com.appointment.app.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Appoitnment/Staff")
@CrossOrigin(origins  = " * ")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping

    @RequestMapping(value = "/newStaff", method = RequestMethod.POST,headers = "Accept= application/json")

    public ResponseEntity<?> newStaff (@RequestBody Staff staff) {
        try{
            return new ResponseEntity<Staff>(this.staffService.newStaff(staff), HttpStatus.OK);
        }
        catch (RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT );
        }
    }




}

