package com.example.demo.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public   interface StudentRepo extends JpaRepository<Student,Long> {
	
	
	@Query(value="select * from mystudent.student", nativeQuery=true)
	List<Student> getstudent();
	@Query(value="select * from mystudent.student where name='keerthana'  and id='1'", nativeQuery=true)
	public Student getbynameandid();
	
	
}

