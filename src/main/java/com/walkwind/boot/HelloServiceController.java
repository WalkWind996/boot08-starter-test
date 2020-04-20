package com.walkwind.boot;

import com.walkwind.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-20-23:23
 **/
@RestController
public class HelloServiceController{

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){
        return  helloService.sayHello("zhangSan");
    }
}
