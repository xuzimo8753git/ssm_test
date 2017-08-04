package com.bw.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private com.bw.dao.StudentDao studentDao;

	@Override
	public com.bw.pojo.Student getStudent(long studentId) {
		return studentDao.findById(studentId);
	}

	@Override
	@Transactional
	public void saveStudent(com.bw.pojo.Student student) {
		studentDao.save(student);
	}

	@Override
	public List<com.bw.pojo.Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public void delete(long studentId) {
		studentDao.delete(studentId);
	}

}
