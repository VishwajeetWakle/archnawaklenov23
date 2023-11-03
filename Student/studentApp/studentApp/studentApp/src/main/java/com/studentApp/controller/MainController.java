package com.studentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentApp.entity.StudentEntity;
import com.studentApp.repository.StudentRepo;
import com.studentApp.service.StudentService;

@RestController
public class MainController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody StudentEntity student) {
		
		return service.saveStudnet(student);
	}

	@GetMapping("/get-all")
	public List<StudentEntity> getAllStud(){
		return service.getAll();
	}
	
	@PutMapping("/updateMobile-studById")
	public String updateMoByID(@RequestBody StudentEntity stud){
		int rs = service.updateMoByID(stud);
		if(rs!=0) {
			return "Data Updated Successfully";
		}else return "Given Id is not present";
	}
	
	@GetMapping("/get-mailofclass")
	public List<String> getStudMailsByClass(@RequestParam String classNO){
		return service.getMailsByClassNO(classNO);
	}
}
