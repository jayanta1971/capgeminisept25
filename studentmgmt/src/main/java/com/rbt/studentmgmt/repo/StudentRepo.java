package com.rbt.studentmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbt.studentmgmt.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	

}
