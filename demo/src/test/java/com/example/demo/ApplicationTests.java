package com.example.demo;

import com.example.demo.util.ZhouProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

//    @Value("${com.example.title}")
//    private String title;

    @Autowired
    private ZhouProperties zhouProperties;

	@Test
	public void contextLoads() {
        System.out.println(zhouProperties.getTitle());

	}

}
