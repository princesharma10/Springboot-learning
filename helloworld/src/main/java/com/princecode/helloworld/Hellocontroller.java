package com.princecode.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hellocontroller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World. This is Prince";
    }
  
    @GetMapping(path="/hello-world-bean")  
    public HelloWorldBean helloWorldBean()  
    {  
    return new HelloWorldBean("Hello World Bean"); //constructor of HelloWorldBean  
    }  

    //passing a path variable  
    @GetMapping(path="/hello-world/path-variable/{name}")  
   public HelloWorldBean helloWorldPathVariable(@PathVariable String name)  
   {  
    return new HelloWorldBean(String.format("Hello World, %s", name)); //%s replace the name  
   }  
    
}

