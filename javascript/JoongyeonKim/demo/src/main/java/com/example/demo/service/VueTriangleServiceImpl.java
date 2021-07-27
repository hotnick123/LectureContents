package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.Triangle;
import com.example.demo.repository.VueProductRepository;
import com.example.demo.repository.VueTriangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueTriangleServiceImpl implements VueTriangleService {

    @Autowired
    private VueTriangleRepository repository;

    @Override
    public void register(Triangle triangle)   {
        repository.create(triangle);
    }


}
