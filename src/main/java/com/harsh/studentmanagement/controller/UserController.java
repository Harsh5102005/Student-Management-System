package com.harsh.studentmanagement.controller;
import com.harsh.studentmanagement.dto.ApiResponse;
import com.harsh.studentmanagement.model.User;
import com.harsh.studentmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/Register")
    public User Register(@RequestBody User user){
        return userService.Register(user);
    }
    @PostMapping("/Login")
    public ApiResponse login(@RequestBody User user){
        String result=userService.login(user.getUsername(),user.getPassword());
        if(result.startsWith("ey")){
            return new ApiResponse(result,true);
        }
        else {
            return new ApiResponse(result,false);
        }


    }
    @GetMapping("/admin/data")
    public String getAdminData(){
        return "only admin can see it";
    }

}
