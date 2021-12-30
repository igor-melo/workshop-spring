package com.udemy.workshopspringh2.config;

import com.udemy.workshopspringh2.data.entities.User;
import com.udemy.workshopspringh2.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@brown.com", "9988888", "123456");
        User u2 = new User(null, "Alex Green", "alex@green.com", "9977777777", "654123");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
