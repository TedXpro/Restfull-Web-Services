package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world") // similar to RequestMapping but it
    // reduces using method = RequestMethod.GET
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")  // returning a bean 
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

        @GetMapping(path = "/hello-world/path-variable/{name}")  // returning a bean 
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s",name));
    }
}
