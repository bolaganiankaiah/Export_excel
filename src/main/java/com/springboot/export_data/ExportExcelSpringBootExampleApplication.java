package com.springboot.export_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.export_data.entity.Student;
import com.springboot.export_data.service.StudentService;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.export_data")
public class ExportExcelSpringBootExampleApplication  {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {

		SpringApplication.run(ExportExcelSpringBootExampleApplication.class, args);
	}
}