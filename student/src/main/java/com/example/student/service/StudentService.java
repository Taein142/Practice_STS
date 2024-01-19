package com.example.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dto.StudentDTO;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public void save(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		System.out.println("studentService.save()");
		studentRepository.save(studentDTO);
	}

	public List<StudentDTO> findAll() {
		// TODO Auto-generated method stub
		System.out.println("studentService.findAll");
		return studentRepository.findAll();
	}

	public StudentDTO findById(Long id) {
		// TODO Auto-generated method stub
		System.out.println("studentService.findById");
		return studentRepository.findById(id);
	}

	public void update(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		System.out.println("studentService.update");
		studentRepository.update(studentDTO);
	}

	

}
