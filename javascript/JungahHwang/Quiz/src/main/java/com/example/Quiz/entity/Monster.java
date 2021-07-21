package com.example.Quiz.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Monster {
    private int monsterNo;
    private String name;
    private int hp;
    private int exp;
    private int money;
}
