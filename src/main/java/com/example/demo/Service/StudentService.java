package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Student;


public interface StudentService {
	public Student savedata(Student student);
	public List<Student> getall();
	public void delete(long id);
	public Student update(Student student);
	public Student getsingledata(long id);
	
	

}
