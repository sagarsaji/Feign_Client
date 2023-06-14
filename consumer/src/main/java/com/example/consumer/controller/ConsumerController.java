package com.example.consumer.controller;

import com.example.consumer.entity.Consumer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Student")
public interface ConsumerController {

    @GetMapping("/student/data")
    public List<Consumer> getStud();

    @GetMapping("/student/data/{id}")
    public Consumer findStudById(@PathVariable int id);

}
