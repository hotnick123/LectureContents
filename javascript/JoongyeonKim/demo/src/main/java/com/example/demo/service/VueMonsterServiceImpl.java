package com.example.demo.service;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Product;
import com.example.demo.repository.VueMonsterRepository;
import com.example.demo.repository.VueProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueMonsterServiceImpl implements VueMonsterService {

    @Autowired
    private VueMonsterRepository repository;

    @Override
    public void register(Monster monster)   {
        repository.create(monster);
    }

    @Override
    public List<Monster> lists() throws Exception {
        return repository.list();
    }
    /*
    @Override
    public Product read(Integer productNo) throws Exception {
        return productrepository.read(productNo);
    }

    @Override
    public void remove(Integer productNo) throws Exception {
        productrepository.delete(productNo);
    }

    @Override
    public void modify(Product product) throws Exception {
        productrepository.update(product);
    }

     */
}
