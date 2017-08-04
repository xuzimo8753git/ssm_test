package com.bw.dao;

import com.bw.pojo.Student;

import java.util.List;

public interface StudentDao {
	
	public Student findById(Long id);
	
	public void save(Student student);
	
	public List<Student> findAll();

	public void delete(long studentId);
}
