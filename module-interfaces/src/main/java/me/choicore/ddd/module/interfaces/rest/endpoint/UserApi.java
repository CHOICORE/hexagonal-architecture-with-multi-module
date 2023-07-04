package me.choicore.ddd.module.interfaces.rest.endpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {


    @GetMapping(value = "/api/v1/users")
    public String getUsers() {
        return "Hello, World!";
    }

}
