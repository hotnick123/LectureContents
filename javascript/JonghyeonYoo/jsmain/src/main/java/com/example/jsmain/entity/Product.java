package com.example.jsmain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
//
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {
    private int productNo;
    private String product_name;
    private String description;
    private String producer;
    private int price;
    private Date regDate;
}