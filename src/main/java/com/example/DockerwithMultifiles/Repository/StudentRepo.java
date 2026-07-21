package com.example.DockerwithMultifiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DockerwithMultifiles.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
