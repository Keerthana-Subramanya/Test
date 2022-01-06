package com.example.demo.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;


@RestController
public class Controller {
	@Autowired 
	private StudentService service;
	@Autowired
	private StudentRepo repo;

	
	@PostMapping("/savedata")
	public Student Savedata(@RequestBody Student student)
	{
		return service.savedata(student);
	}
	@GetMapping("/getdata")
	public List<Student> getdata()
	{
		return service.getall();
	}
	@DeleteMapping("/deletedata")
	public void deletedata()
	{
	  service.delete(4);
	}
	  @PutMapping("/updatedata/{id}")
	public Student updatedata (@PathVariable("id") long id, @RequestBody Student student)
	{
		  student.setId(id);
		  return service.update(student);
}
	  @GetMapping("/getbyid/{id}")
	  public Student getdatabyId(@PathVariable("id") long id)
	  {
		  return service.getsingledata(id);
	  }
	 @GetMapping("/getall")
	 public List<Student> getall()
	 {
		 return repo.getstudent();
	 }
	 @GetMapping("/get")
	 public Student getbynameid()
	 {
		 return repo.getbynameandid();
	 }
	 
}

