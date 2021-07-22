package com.example.jsmain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Monster {
    private int monsterNo;
    private String monster_name;
    private int hp;
    private int atk;
    private int def;
    private Date regDate;
}