package com.harsh.studentmanagement.controller;
import com.harsh.studentmanagement.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.harsh.studentmanagement.service.service;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/students")
public class studentController {
    @Autowired
    private service service;
    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }
    @PostMapping
    public Student addstudent(@Valid @RequestBody Student student){
        return service.addStudent(student);


    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return service.getStudentById(id);

    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        service.deletebyId(id);
        return "Deleted";
    }
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student){
        service.updateStudent(id,student);
        return "updated";
    }






}
