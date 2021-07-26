package com.example.cholongtest.service;

import com.example.cholongtest.entity.Student;
import com.example.cholongtest.repository.VueStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VueStudentServiceImpl implements VueStudentService  {

    @Autowired
    private VueStudentRepository repository;

    @Override
    public List<Student> gradeList() throws Exception {
        return repository.gradeList();
    }
}
