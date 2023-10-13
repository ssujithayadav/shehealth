package com.myapp.shehealth.controller;

import com.myapp.shehealth.entity.User;
import com.myapp.shehealth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){

        return service.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @GetMapping("/userByName/{name}")
    public User findUserByName(@PathVariable String name){
        return service.getUserByName(name);
    }

//    @PutMapping("/update")
//    public User updateUser(@RequestBody User user){
//        return service.updateUser(user);
//    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }


}
