package com.syzc.controller;

import com.syzc.entity.User;
import com.syzc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xueli
 * @email 2632624281@qq.com
 * @date 2022-04-04 10:16
 * @description
 */
@RestController
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        System.out.println("id" +id);
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        System.out.println("user" + user);
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        System.out.println("user" + user);
        userRepository.update(user);
    }

    @DeleteMapping("/deleteById/{id")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
