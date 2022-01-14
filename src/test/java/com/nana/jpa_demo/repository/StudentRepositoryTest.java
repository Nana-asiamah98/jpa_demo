package com.nana.jpa_demo.repository;

import com.nana.jpa_demo.entity.Student;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
class StudentRepositoryTest {


    private final StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        var student = new Student();
                student.setEmailId("nana@nana.com");
                student.setFirstName("nana");
                student.setLastName("nana");
                student.setGuardianName("Nana");
                student.setGuardianEmail("guard@nana.com");
                student.setGuardianMobile("99999");

        studentRepository.save(student);

    }

    @Test
    public void  printAllStudent(){
        List<Student> students = studentRepository.findAll();
        System.out.println("students : " + students);
    }

}