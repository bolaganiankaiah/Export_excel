package com.springboot.export_data.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.export_data.entity.Student;
import com.springboot.export_data.repository.StudentRepos;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepos studentRepo;

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    @Override
    public List < Student > getTheListStudent() {
        return studentRepo.findAll();
    }
}