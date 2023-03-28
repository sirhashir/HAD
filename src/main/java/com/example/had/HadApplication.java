package com.example.had;

import com.example.had.sample.Dummydata;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HadApplication {


    private Dummydata dummydata;

    public HadApplication(Dummydata dummydata)
    {
        this.dummydata = dummydata;
    }

   public static void main(String[] args)
   {
        SpringApplication.run(HadApplication.class, args);
   }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            dummydata.generateData();
        };
    }


}