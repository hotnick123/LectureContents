package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Monster {
    private Integer monsterNo;
    private String monster_name;
    private Integer hp;
    private Integer exp;
    private Integer money;
    private Date regDate;
}
