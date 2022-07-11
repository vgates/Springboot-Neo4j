package com.smredlabs.springneo4j.controller;

import com.smredlabs.springneo4j.entity.Student;
import com.smredlabs.springneo4j.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/students/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students/getAll")
    public ResponseEntity getAllStudents(){
        List<Student> students = studentService.findStudents();
        return ResponseEntity.ok(students);
    }

    @DeleteMapping("/students/delete/{id}")
    public ResponseEntity getAllStudents(@PathVariable String id){
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

}

/*
Add Student Request Body
{
    "id":"1",
    "name":"Vinod",
    "admissionNo":"123456",
    "department":[{"id":"CS","name":"Computer Science"}]
}
*/
