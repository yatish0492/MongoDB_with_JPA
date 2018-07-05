package com.yatish.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yatish.pojos.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{
	
	public List<Student> findBySalaryLessThan(int maxPrice);
}
