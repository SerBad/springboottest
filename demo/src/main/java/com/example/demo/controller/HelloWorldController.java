package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import com.example.demo.util.ZhouProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhou on 2017/7/4.
 */
@RestController
public class HelloWorldController extends BaseController{
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/hello")

    public List<User> hello() {
        List<User> list = new ArrayList<>();

        Page<User> page=userRepository.findAll(pageable.next());
//        list.addAll(userRepository.findAll(pageable).getContent());

        list.addAll(userRepository.findAll(pageable.next()).getContent());
        ZhouProperties zhouProperties=new ZhouProperties();
        System.out.println(zhouProperties.getTitle());
        return list;
    }
}
