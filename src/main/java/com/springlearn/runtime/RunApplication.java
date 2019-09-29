package com.springlearn.runtime;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.springlearn")
@SpringBootApplication
public class RunApplication {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(RunApplication.class, args);
    }
}
