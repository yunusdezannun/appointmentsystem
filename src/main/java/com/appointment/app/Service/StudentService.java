package com.appointment.app.Service;

import com.appointment.app.Models.Student;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }


    public List<Student> getAllStudent() {
        return this.studentRepository.findAll();
    }


	public Student deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}


	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}



}
