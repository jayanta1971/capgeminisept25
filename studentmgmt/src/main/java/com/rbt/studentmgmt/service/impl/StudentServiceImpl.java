package com.rbt.studentmgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbt.studentmgmt.entity.Student;
import com.rbt.studentmgmt.exception.DataNotFoundException;
import com.rbt.studentmgmt.repo.StudentRepo;
import com.rbt.studentmgmt.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		if(studentRepo.findById(id).isEmpty())
		{
			throw new DataNotFoundException("Data Not Found");
		}
		else
		{
			return studentRepo.findById(id).get();
		}
		 
	}

}
