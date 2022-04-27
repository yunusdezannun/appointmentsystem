package com.appointment.app.Repository;

import com.appointment.app.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT pr FROM conf_Programs pr WHERE pr.prog_programID = ?1")
    public Conf_Programs findByProgramID(int programID);

    @Query("SELECT pr FROM conf_Programs pr WHERE pr.prog_programCode = ?1")
    public List<Conf_Programs> findByProgramCode(String programCode);

    @Query("SELECT pr FROM conf_Programs pr WHERE pr.prog_fk_educationLevelID = ?1")
    public List<Conf_Programs> findByEducationLevel(Conf_EducationLevels educationLevelID);

}

