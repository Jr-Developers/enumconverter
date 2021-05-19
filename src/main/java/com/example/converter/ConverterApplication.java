package com.example.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.AttributeConverter;
import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RestController
@EntityScan
public class ConverterApplication {
    @Autowired
    private SampleRepository sampleRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConverterApplication.class, args);
    }


    @GetMapping("/")
    public List<Sample> test(){
        sampleRepository.save(new Sample(UUID.randomUUID().toString(), Gender.MAN));
        sampleRepository.save(new Sample(UUID.randomUUID().toString(), Gender.WOMAN));

        return sampleRepository.findAll();
    }
}