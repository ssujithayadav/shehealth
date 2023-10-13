package com.myapp.shehealth.service;

import com.myapp.shehealth.entity.User;
import com.myapp.shehealth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
       return repository.save(user);
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);

    }

    public User getUserByName(String name){
        return repository.findByName(name);
    }

    public String deleteUser(int id){

        repository.deleteById(id);
        return "deleted user of id."+ id;
    }

//    public User updateUser(User user){
//        User existingUser=repository.findById(user.getUserId()).orElse(null);
//        existingUser.setName(user.getName());
//        existingUser.setAge(user.getAge());
//        existingUser.setWeight(user.getWeight());
//        existingUser.setHeight(user.getHeight());
//        existingUser.setBmi(user.getUserHealthDetails());
//
//
//        return repository.save(existingUser);
//    }






}
