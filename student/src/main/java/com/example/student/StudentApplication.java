package com.example.student;

import com.example.student.entity.Student;
import com.example.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/student")
public class StudentApplication {

	@Autowired
	private StudentRepo repo;

	@GetMapping("/data")
	public List<Student> getStud(){
		return repo.findAll();
	}

	@GetMapping("/data/{id}")
	public Student findStudById(@PathVariable int id){
		return repo.findById(id).orElse(null);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
