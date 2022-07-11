package com.smredlabs.springneo4j.service;

import com.smredlabs.springneo4j.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    Student addStudent(Student student);
    List<Student> findStudents();

    String deleteStudent(String id);
}
