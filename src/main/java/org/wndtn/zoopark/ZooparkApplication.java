package org.wndtn.zoopark;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ZooparkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooparkApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(Zoo zoo) {
        return args -> {
            zoo.makeSounds();
        };
    }
}