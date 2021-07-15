package com.study;

import com.study.mapper.UserMapper;
import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/userList")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
    @GetMapping("/user")
    public String queryUserById(int id){
        System.out.println("hjcskjc");
        userMapper.queryUserById(id);

        return "ok";
    }
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(28,"2","x","d",1));

        return "ok";
    }
    @GetMapping("/updateUser")
    public String updateUser(User user){
        userMapper.updateUser(user);

        return "ok";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(int id){
        userMapper.deleteUser(id);

        return "ok";
    }
}
