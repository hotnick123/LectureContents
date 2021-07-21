package com.example.projectTest.service;


import com.example.projectTest.entity.Project;
import com.example.projectTest.repository.VueProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VueProjectServiceImpl implements VueProjectService {

    @Autowired
    private VueProjectRepository repository;

    @Override
    public void register(Project project) throws Exception {
        repository.create(project);
    }

   /* @Override
    public void login(Member member) throws Exception {
        repository.login(member);
    }

    @Override
    public List<Member> list() throws Exception {
        return repository.list();
    }*/
}
