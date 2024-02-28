package com.OnlineExamSystem.loginRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineExamSystem.model.Exam;

//import com.example.ExamSystemManagementSystem.model.Employee;


//public class Repository {
	

	

	public interface Repository extends JpaRepository<Exam, String> {
		
	}

//}
