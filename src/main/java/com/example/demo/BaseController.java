package com.example.demo;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by zhou on 2017/7/4.
 */
//提供json接口

public class BaseController {
    protected int page = 0, size = 1;
    protected Pageable pageable = new PageRequest(page, size, new Sort(Sort.Direction.ASC, "id"));
}
