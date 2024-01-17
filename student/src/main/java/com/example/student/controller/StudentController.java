package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.student.Service.StudentService;
import com.example.student.dto.StudentDTO;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/save")
	public String save() {
		System.out.println("StudentController.save.get");
		return "save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute StudentDTO studentDTO) {
		System.out.println("StudentController.save.post");
		System.out.println("StudentDTO" + studentDTO);
		studentService.save(studentDTO);
		return "index";
//		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		System.out.println("StudentController.findAll");
		List<StudentDTO> studentDTOs = studentService.findAll();
		model.addAttribute("studentList", studentDTOs);
		System.out.println(studentDTOs);
		return "list";
	}
}
