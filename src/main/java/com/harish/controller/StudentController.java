package com.harish.controller;

import com.harish.entity.Student;
import com.harish.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

   private final StudentService studentService;

   // you can add class name as a qualifier too

    public StudentController(@Qualifier("db") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email)
    {
        return studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents()
    {
        return studentService.findAllStudents();
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email)
    {
        studentService.delete(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }

}
