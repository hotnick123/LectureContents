package com.example.jswithspring.controller.vue.jpa.request;

import com.example.jswithspring.entity.jpa.Member;
import com.example.jswithspring.entity.jpa.MemberAuth;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;

@Data
@Slf4j
@NoArgsConstructor
public class MemberRequest {
    private String userId;
    private String password;
    private String auth;
}
