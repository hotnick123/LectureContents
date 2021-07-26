package com.example.demo.service;

import com.example.demo.entity.Dungeon;
import com.example.demo.entity.Student;
import com.example.demo.repository.VueDungeonRepository;
import com.example.demo.repository.VueStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueStudentServiceImpl implements VueStudentService {

    @Autowired
    private VueStudentRepository repository;

    @Override
    public List<Student> averageList() throws Exception {
        return repository.averageList();
    }
}
