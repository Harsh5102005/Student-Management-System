package com.harsh.studentmanagement.service;
import com.harsh.studentmanagement.Repository.StudentRepository;
import com.harsh.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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


    public void patchStudent(int id, Map<String, Object> updates) {
        Student exist=repo.findById(id).orElseThrow(()-> new RuntimeException("student not found"));
        updates.forEach( (key,value) -> {
            switch (key) {
                case "name":
                    exist.setName((String) value);
                    break;
                case "course":
                    exist.setCourse((String) value);
                    break;
                case "id":
                    exist.setId(Integer.parseInt((String) value));
                    break;
                default:
                    throw new RuntimeException("field not found");
            }
            repo.save(exist);
        });
    }

}
