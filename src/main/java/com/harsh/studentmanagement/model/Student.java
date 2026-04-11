package com.harsh.studentmanagement.model;
import jakarta.persistence.*;
import  jakarta.validation.constraints.*;
@Entity
public class Student {
    @Id
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String course;
    public int  getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

}
