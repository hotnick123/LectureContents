package com.example.springTest.service.jpa;

import com.example.springTest.controller.vue.jpa.request.MemberRequest;
import com.example.springTest.entity.jpa.Member;

import java.util.List;
import java.util.Optional;

public interface JPAMemberService {
    public void register(MemberRequest memberRequest) throws Exception;
    /*
    public void login(Member member) throws Exception;
    public List<Member> list() throws Exception;
     */
    public List<Member> findByJPQL () throws Exception;
    public Optional<Member> findByAuth(Long memberNo);
}
