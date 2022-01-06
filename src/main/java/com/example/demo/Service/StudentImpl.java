package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.model.Student;
@Service
public class StudentImpl implements StudentService {
	
@Autowired
StudentRepo repo;
	@Override
	public Student savedata(Student student) {
		return repo.save(student);
	}
	@Override
	public  List<Student> getall() {
		
		return repo.findAll();
	}
	@Override
	public void delete(long id) {
		  repo.deleteById(id);
		
	}
	@Override
	public Student update(Student student) {
		
		return repo.save(student);
	}
	@Override
	public Student getsingledata(long id) {
		
		 Optional<Student> student= repo.findById(id);
		 if(student.isPresent())
		 {
			 return student.get();
		 }
throw new RuntimeException("not found");

	}
	
	
	

}