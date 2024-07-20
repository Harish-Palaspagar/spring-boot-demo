package com.harish.service;

import com.harish.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents()
    {
        return List.of(
                new Student("Harish",
                        "Palaspagar",
                        LocalDate.now(),
                        "harish@gmail.com",
                        18)

                ,

                new Student("Rahul",
                        "Kumar",
                        LocalDate.now(),
                        "rahul@gmail.com",
                        20)
        );

    }


}
