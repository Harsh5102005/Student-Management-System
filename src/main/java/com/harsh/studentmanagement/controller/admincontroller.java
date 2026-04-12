package com.harsh.studentmanagement.controller;

import com.harsh.studentmanagement.Repository.UserRepository;
import com.harsh.studentmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class admincontroller {

    @Autowired
    private UserService userService;

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        userService.delete(id);
        return "delete successfully";
    }

}
