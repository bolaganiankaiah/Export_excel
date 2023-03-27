package com.springboot.export_data.service;

import java.util.List;

import com.springboot.export_data.entity.Student;


public interface StudentService {
    void addStudent(Student student);
    List < Student > getTheListStudent();
}