package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import com.example.demo.util.ZhouProperties;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhou on 2017/7/4.
 */
@RestController
//@ApiModel
public class HelloWorldController extends BaseController {
    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "hello world", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = false, dataType = "Long")
    })
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<User> hello(Long l) {
        System.out.println("-=-=-=-" + l);
        List<User> list = new ArrayList<>();

        Page<User> page = userRepository.findAll(pageable.next());
        list.addAll(userRepository.findAll(pageable).getContent());

        list.addAll(userRepository.findAll(pageable.next()).getContent());
        ZhouProperties zhouProperties = new ZhouProperties();
        System.out.println(zhouProperties.getTitle());
        return list;
    }
}
