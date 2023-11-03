package com.studentApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentApp.entity.StudentEntity;
import com.studentApp.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public String saveStudnet(StudentEntity student ) {
		
		boolean flag = true;
		String success = "Data Saved Successfully";
		String fail = "Error Occured !!!!!!!!!!";
		try {
			repo.save(student);
		}catch (Exception e) {
			flag = false;
			fail = fail+"\n\n"+e.getMessage();
		}
		
		if(flag) {
			return success;
		}else {
			return fail;
		}
	}

	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public int updateMoByID(StudentEntity stud) {
		// TODO Auto-generated method stub
		return repo.updateMoById(stud.getId(), stud.getMobile());
	}

	public List<String> getMailsByClassNO(String classNO) {
		// TODO Auto-generated method stub
		List<StudentEntity> stud = repo.findByClass(classNO);
		
		List<String> mails = new ArrayList<String>();
		
		for(StudentEntity s : stud) {
			mails.add(s.getEmail());
		}
		
		return mails;
	}
	
	

}
