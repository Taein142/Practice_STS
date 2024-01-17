package com.example.student.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class StudentDTO {
	private Long id;
	private String studentName;
	private String studentNumber;
	private String studentMajor;
	private String studentMobile;
}
