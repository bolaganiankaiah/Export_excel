package com.springboot.export_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.export_data.entity.Student;

public interface StudentRepos extends JpaRepository < Student, Long > {
}