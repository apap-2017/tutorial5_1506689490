package com.example.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
	@NotEmpty
    private String npm;
	@NotEmpty
    private String name;
	@NotNull
    private double gpa;
	private List<CourseModel> courses;

}
