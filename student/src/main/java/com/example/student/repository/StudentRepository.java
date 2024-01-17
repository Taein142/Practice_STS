package com.example.student.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.dto.StudentDTO;

@Repository
public class StudentRepository {
	@Autowired
	private SqlSessionTemplate sql;

	public void save(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		System.out.println("StudentRepository.save()");
		sql.insert("Student.save", studentDTO);
	}

	public List<StudentDTO> findAll() {
		// TODO Auto-generated method stub
		System.out.println("StudentRepository.findAll");
		return sql.selectList("Student.findAll");
	}

	

}
