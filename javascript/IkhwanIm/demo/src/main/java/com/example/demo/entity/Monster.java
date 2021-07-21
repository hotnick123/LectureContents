package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Monster {
    private int monsterNo;
    private String monster_name;
    private int hp;
    private int exp;
    private int money;
    private Date regDate;
}
