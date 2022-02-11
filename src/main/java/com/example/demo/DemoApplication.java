package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class DemoApplication {
	static List<Person> members = new ArrayList<Person>(Arrays.asList(new Person("Jatin")));

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/members")
	public List<Person> hello() {
		return members;
	}

	@PostMapping("/add/member")
	public String addMember(@RequestBody Person memberName) {
		members.add(memberName);
		return "Data inserted";
	}
}
