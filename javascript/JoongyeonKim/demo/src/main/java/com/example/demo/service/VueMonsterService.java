package com.example.demo.service;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Product;

import java.util.List;

public interface VueMonsterService {
    public void register(Monster monster);

    public List<Monster> lists() throws Exception;

    /*
    public Product read(Integer productNo) throws Exception;

    public void remove(Integer productNo) throws Exception;

    public void modify(Product product) throws Exception;
    */
}
