package com.harish.service;

import com.harish.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

     List<Student> findAllStudents();

     Student saveStudent(Student student);

     Student findByEmail(String email);

     void delete(String email);

     Student updateStudent(Student student);

}
