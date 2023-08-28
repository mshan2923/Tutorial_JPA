package com.example.tutorial_jpa.controller;

import com.example.tutorial_jpa.entity.Users;
import com.example.tutorial_jpa.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Spliterator;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user/save")
    public  Users  userSave(@RequestBody Users user)//Work But Autometic Set ID
    {
        return userRepository.save(user);
    }
    @PostMapping("/user/add")
    public boolean userAdd(Long id, String name)//Can Recieve Data , But Can't Acess DB
    {
        //값은 들어왔는데 save 에서 에러뜸
        var data = new Users();
        data.setID(id);
        data.setUsername(name);

        var temp = userRepository.save(data);

        return userRepository.findById(id).isPresent();
    }

    @GetMapping("/user/exist")
    public  boolean  userLoad(Long id)
    {
        return userRepository.findById(id).isPresent();
    }
    //PostMap 에서 주소 적고 , Body탭 에서 form-data 선택후 Key에 파라미터 이름 적고 Send!
    //Input Address in PostMan , BodyTab > Choose 'form-data' > input parameterName in Key > Send
}
