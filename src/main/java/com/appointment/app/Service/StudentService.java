package com.appointment.app.Service;

import com.appointment.app.Models.Student;
import com.appointment.app.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;
    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllCreatedPrograms() {
        return this.studentRepository.findAll();
    }

    public List<Conf_Programs> getAllPrograms() {
        return this.programRepo.findAllPrograms();
    }

    public Student newProgram(Conf_Programs program) {
        if(programRepo.matchExistingProgram(program.getProg_programCode(),program.getProg_programName()).isPresent()){
            throw new RuntimeException("Program with code ("+program.getProg_programCode()+") and name ("+program.getProg_programName()+") already exist.");
        }
        return this.programRepo.save(program);
    }

    public Student deleteStudent(Student student) {
        if(!studentRepository.existsById(student.getProg_programID())){
            throw new RuntimeException("This program does not exist.");
        }
        program.setProg_delStatus(0);
        return this.programRepo.save(program);
    }


    public Student updateStudent(Student student) {
        if(!studentRepository.existsById(student.getProg_programID())){
            throw new RuntimeException("This program does not exist.");
        }
        return this.studentRepository.save(student);
    }


}
