package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Monster {
    private int monsterNo;
    private String monsterName;
    private int hp;
    private int atk;
    private Date regDate;
}
