package com.appointment.app.Controller;

import com.appointment.app.Models.Student;
import com.appointment.app.Service.StudentService;
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

    @RequestMapping(value = "/deleteProgram", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<?> deleteProgram(@RequestBody Student student){
        try{
            return new ResponseEntity<Student>(this.studentService.deleteProgram(student), HttpStatus.OK);
        }
        catch(RuntimeException ex){
            return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/getPrograms", method = RequestMethod.GET)
    public ResponseEntity<?> getPrograms(){
        return new ResponseEntity<List<Student>>(this.studentService.getAllPrograms(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllCreatedPrograms", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCreatedPrograms(){
        return new ResponseEntity<List<Student>>(this.studentService.getAllCreatedPrograms(), HttpStatus.OK);
    }
}
