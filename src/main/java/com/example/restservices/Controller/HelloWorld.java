package com.example.restservices.Controller;

import com.example.restservices.Model.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rahul
 * @date 10/5/2023 1:19 PM
 * -
 */

@RestController
public class HelloWorld {
//    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    @GetMapping("/helloworld1")
    public String helloWorld(){
        return "Hello World1";
    }

    @GetMapping("/helloworldBean")
    public UserDetails helloWorldBean(){
        return new UserDetails("rabbit", "9", "Pune");
    }
}
