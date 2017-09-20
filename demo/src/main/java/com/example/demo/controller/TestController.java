package com.example.demo.controller;

import com.example.demo.base.BaseController;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import com.example.demo.util.ZhouProperties;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
public class TestController extends BaseController {
    @Autowired
    private ZhouProperties zhouProperties;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object hello() {
        System.out.println(zhouProperties.getTitle());
        return zhouProperties.getTitle();
    }
}
