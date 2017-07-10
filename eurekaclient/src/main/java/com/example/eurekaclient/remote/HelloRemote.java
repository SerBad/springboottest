package com.example.eurekaclient.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhou on 2017/7/10.
 */
@FeignClient(name= "spring-cloud-config-server")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
      String hello(@RequestParam(value = "name") String name);
}