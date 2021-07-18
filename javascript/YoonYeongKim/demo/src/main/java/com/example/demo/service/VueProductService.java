package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.entity.Product;

import java.util.List;

public interface VueProductService {
    public void register(Product product) throws Exception;

    public List<Product> list() throws Exception;

}