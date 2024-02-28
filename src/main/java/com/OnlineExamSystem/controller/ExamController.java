package com.OnlineExamSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineExamSystem.loginRepository.Repository;
import com.OnlineExamSystem.model.Exam;

@Controller
public class ExamController {
	
	@Autowired
	Repository repo;
	//private ListCrudRepository<Employee, String> loginRepo;
	
	@GetMapping("/login")
	public String getName() {
		return "index";
	} 

	@GetMapping("/register")
	public String getExam() {
		return "register";
	}
	
	@PostMapping("/Home")
	public String home(@ModelAttribute Exam exam)
	{
		System.out.println(exam);
		repo.save(exam);
		return "home";
	}
	
	@GetMapping("/get")
	public List<Exam> getValue() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}

//	@DeleteMapping("/exam/(emailid)")
//	public void deleteOnline(@PathVariable String emailid) {
//		repo.deleteById(emailid);
//		
//	}
//	
	
//	@RequestMapping("/delete/{emailid}")
//	public void deleteOnline(@PathVariable String emailid) {
//		repo.deleteById(emailid);
//	}

}


