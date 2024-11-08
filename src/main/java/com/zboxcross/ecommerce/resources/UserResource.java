package com.zboxcross.ecommerce.resources;


import com.zboxcross.ecommerce.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(null,"Bryan");
        return ResponseEntity.ok().body(u);
    }
}
