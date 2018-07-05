package com.yatish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yatish.pojos.Student;
import com.yatish.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	public void save() {
		Student obj = new Student();
		obj.setId(1);
		obj.setName("yatish");
		obj.setSalary(5000);
		repository.save(obj);
		Student obj1 = new Student();
		obj1.setId(2);
		obj1.setName("Ashok");
		obj1.setSalary(3000);
		repository.save(obj1);
		List<Student> list = repository.findBySalaryLessThan(4000);
		System.out.println(list.get(0).getName());
		
	

		
	}
	
	public void get() {
//		List<Student> list = repository.findByName("yatish");
//		System.out.println("-------------- Fetched Student Object is ----------------------");
//		System.out.println("id - " + list.get(0).studentId + " name - " + list.get(0).name);
	}
}
