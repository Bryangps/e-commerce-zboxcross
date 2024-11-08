package com.zboxcross.ecommerce.config;

import com.zboxcross.ecommerce.entities.User;
import com.zboxcross.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfing implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public void run(String... args) throws Exception {
        User u1 = new User(null, "Gui Red");
        User u2 = new User(null, "Clara Borge");
        User u3 = new User(null, "Maria Blue");

        userRepository.saveAll(Arrays.asList(u1,u2,u3));

    }
}
