package com.harsh.studentmanagement.service;
import com.harsh.studentmanagement.Repository.StudentRepository;
import com.harsh.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    private StudentRepository repo;
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    public  Student addStudent(Student student){
        return repo.save(student);
    }
    public Student getStudentById(int id){
        return repo.findById(id).orElse(null);
    }
    public void deletebyId(int id){
        repo.deleteById(id);
    }
    public void updateStudent(int id,Student newStudent){
        Student exist=repo.findById(id).orElse(null);
        if(exist!=null){
            exist.setName(newStudent.getName());
            exist.setCourse(newStudent.getCourse());
            repo.save(exist);
        }
    }







}
