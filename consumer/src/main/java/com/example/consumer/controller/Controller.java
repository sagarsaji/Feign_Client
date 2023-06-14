package com.example.consumer.controller;

import com.example.consumer.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class Controller {

    @Autowired
    private ConsumerController cont;

    @GetMapping("/details")
    public List<Consumer> getDets(){
        return cont.getStud();
    }

    @GetMapping("/details/{id}")
    public Consumer findStudById(@PathVariable int id){
        return cont.findStudById(id);
    }

}
