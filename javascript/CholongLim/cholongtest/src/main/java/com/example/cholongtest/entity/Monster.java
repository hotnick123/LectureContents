package com.example.cholongtest.entity;
// entity 핵심 데이터 관리
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Monster {
    private int monsterNo;
    private String name;
    private int hp;
    private int exp;
    private Date regDate;
}




