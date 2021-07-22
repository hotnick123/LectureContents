package com.example.springTest.entity.game;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Monster {
    private int monsterNo;
    private String monsterName;
    private int monsterHp;
    private int monsterExp;
    private int monsterMoney;
    private Date regDate;
}
