package com.appointment.app.Controller;

import com.appointment.app.Models.Student;
import com.appointment.app.Service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Appoitnment/Student")
@CrossOrigin(origins  = " * ")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students/save/")

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST,headers = "Accept= application/json")

    public ResponseEntity<?> newStudent (@RequestBody Student student) {
        try{
            return new ResponseEntity<Student>(this.studentService.newStudent(student), HttpStatus.OK);
        }
        catch (RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT );
        }
    }

    @RequestMapping(value = "/updateStudent", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<?> updateStudent (@RequestBody Student student){
        try{
            return new ResponseEntity<Student>(this.studentService.updateStudent(student), HttpStatus.OK);
        }
        catch(RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/deleteStudent", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<?> deleteProgram(@RequestBody Student student){
        try{
            return new ResponseEntity<Student>(this.studentService.deleteStudent(student), HttpStatus.OK);
        }
        catch(RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/getStudents", method = RequestMethod.GET)
    public ResponseEntity<?> getStudents(){
        return new ResponseEntity<List<Student>>(this.studentService.getAllStudent(), HttpStatus.OK);
    }

    
}
