package com.example.seminar7HWspringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/login")
    public String loginEndPoint(){return "LOGIN";}

    @GetMapping("/user")
    public String userEndPoint(){return "USER";}

    @GetMapping("/admin")
    public String adminEndPoint(){return "ADMIN";}

    @GetMapping("/delete")
    public String deleteEndPoint(@RequestBody String s){return "DELETE";}

    @GetMapping("/all")
    public String allEndPoint(){return "ALL";}

}
