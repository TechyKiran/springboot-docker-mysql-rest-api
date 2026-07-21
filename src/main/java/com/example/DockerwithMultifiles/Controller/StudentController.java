package com.example.DockerwithMultifiles.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DockerwithMultifiles.Model.Student;
import com.example.DockerwithMultifiles.Service.StudentService;

@RestController
@RequestMapping("/docs")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getStudents()
	{
		return ResponseEntity.ok(service.getAllStudents());
	}
	
	
//	@PostMapping("/save")
//	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
//	{
//		return ResponseEntity.ok(service.saveStudents(student));
//	}
	
	
	@PostMapping("/save")
	public ResponseEntity<List<Student>> saveall(@RequestBody List<Student> student)
	{
		return ResponseEntity.ok(service.saveStudents(student));
	}
	

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id)
	{
		return ResponseEntity.ok(service.deleteStudentById(id));
	}
	
	
	@PutMapping("/put/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student,
	                                             @PathVariable Integer id) {
	    Student updatedStudent = service.updateStudent(student, id);
	    return ResponseEntity.ok(updatedStudent);
	}
}
