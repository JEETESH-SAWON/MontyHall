package com.example.montyhall;

import com.example.montyhall.Services.MontyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MontyHallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MontyHallApplication.class, args);
        MontyService obj = new MontyService();
        obj.process();

    }

}
