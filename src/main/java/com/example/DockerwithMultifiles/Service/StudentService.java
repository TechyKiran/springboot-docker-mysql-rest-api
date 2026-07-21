package com.example.DockerwithMultifiles.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.example.DockerwithMultifiles.Exception.StudentNotFoundException;
import com.example.DockerwithMultifiles.Model.Student;
import com.example.DockerwithMultifiles.Repository.StudentRepo;


@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

// To get All Students
	@Cacheable(cacheNames = "#Students")
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	
// To save Student Details
	@CacheEvict(cacheNames = "#Students", allEntries = true)
	public List<Student> saveStudents(List<Student> students) {
	    return repo.saveAll(students);
	}

// To get the Single Student Details
	@Cacheable(cacheNames = "#Students", key="#id")
	public Student getById(Integer id) {
		
		Student s1 = repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Details Are not Found"));
		
		return s1;
	}


// To Delete the Student Details
	@Caching(evict = {
			@CacheEvict(cacheNames = "#Students", allEntries = true),
			@CacheEvict(cacheNames = "#student", key="#id")
	})
	public Student deleteStudentById(Integer id) {
		
		Student s2 = repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student Not Found to Delete"));
		
		repo.delete(s2);
		
		return s2;
	}


// Update The Student Details	
	@Caching(put = {
			@CachePut(cacheNames = "#student", key="#id")
	},
			evict = {
					@CacheEvict(cacheNames = "#Students", allEntries = true)
			})
	public Student updateStudent(Student student, Integer id) {

	    Student s3 = repo.findById(id)
	            .orElseThrow(() -> new StudentNotFoundException("Student Not Found to Update"));

	    s3.setName(student.getName());
	    s3.setEmail(student.getEmail());
	    s3.setGrade(student.getGrade());

	    return repo.save(s3);
	}
	

	

	

	

}
