package com.harish.memory;

import com.harish.dao.InMemoryStudentDao;
import com.harish.entity.Student;
import com.harish.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("im")
@RequiredArgsConstructor
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public List<Student> findAllStudents()
    {
       return this.dao.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return this.dao.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public void delete(String email) {
         this.dao.delete(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.dao.updateStudent(student);
    }

}
