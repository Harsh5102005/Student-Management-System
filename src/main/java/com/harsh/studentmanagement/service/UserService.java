package com.harsh.studentmanagement.service;
import com.harsh.studentmanagement.model.User;
import com.harsh.studentmanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.harsh.studentmanagement.config.JwtUtil;


@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private BCryptPasswordEncoder encoder;
    public User Register(User user){
        user.setRole("User");
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
    public String login(String username,String password){
        User u=repo.findByUsername(username);
        if(u==null){
            return "User not found";
        }
        else if(encoder.matches(password,u.getPassword())){
            return JwtUtil.generateToken(username);
        }
        else{
            return "Wrong Password";
        }
    }
}
