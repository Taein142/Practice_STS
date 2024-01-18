package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "redirect:/list";
		// return "index";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		System.out.println("StudentController.findAll");
		List<StudentDTO> studentDTOs = studentService.findAll();
		model.addAttribute("studentList", studentDTOs);
		System.out.println(studentDTOs);
		return "list";
	}
	
	@GetMapping("/student/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		System.out.println("Controller.findById");
		System.out.println("id =" + id);
		StudentDTO studentDTO = studentService.findById(id);
		System.out.println("studentDTO = " + studentDTO);
		model.addAttribute("student", studentDTO);
		System.out.println(model);
		System.out.println(1);
		return "detail";
	}
}
