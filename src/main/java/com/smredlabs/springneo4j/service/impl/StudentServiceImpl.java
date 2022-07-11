package com.smredlabs.springneo4j.service.impl;

import com.smredlabs.springneo4j.entity.Student;
import com.smredlabs.springneo4j.repository.StudentRepository;
import com.smredlabs.springneo4j.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findStudents() {
        //List<Student> students = studentRepository.findAll();
        //students.stream().forEach(student -> System.out.println(student.getDepartment()));
        return studentRepository.findAll();

    }

    @Override
    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student deleted with id : " + id;
    }
}
