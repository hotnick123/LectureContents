package com.example.Quiz.service;

import com.example.Quiz.entity.Monster;
import com.example.Quiz.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterServiceImpl implements MonsterService {
    @Autowired
    private MonsterRepository repository;

    @Override
    public void create(Monster monster) throws Exception {
        repository.create(monster);
    }
}
