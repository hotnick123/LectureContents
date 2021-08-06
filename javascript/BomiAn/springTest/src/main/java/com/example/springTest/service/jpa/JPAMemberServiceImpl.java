package com.example.springTest.service.jpa;

import com.example.springTest.controller.vue.jpa.request.MemberRequest;
import com.example.springTest.entity.jpa.Member;
import com.example.springTest.entity.jpa.MemberAuth;
import com.example.springTest.repository.jpa.JPAMemberAuthRepository;
import com.example.springTest.repository.jpa.JPAMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JPAMemberServiceImpl implements JPAMemberService {

    @Autowired
    private JPAMemberRepository memberRepository;

    @Autowired
    private JPAMemberAuthRepository memberAuthRepository;

    @Override
    public void register(MemberRequest memberRequest) throws Exception {
        MemberAuth authEntity = new MemberAuth(memberRequest.getAuth());
        Member memberEntity = new Member(memberRequest.getUserId(), memberRequest.getPassword());
        memberEntity.addAuth(authEntity);

        memberRepository.save(memberEntity);
    }

    @Override
    public List<Member> findByJPQL() throws Exception {
        return null;
    }

    @Override
    public Optional<Member> findByAuth(Long memberNo) {
        return memberRepository.findByAuth(memberNo);
    }

    /*
    @Override
    public void login(Member member) throws Exception {
        repository.login(member);
    }
    @Override
    public List<Member> list() throws Exception {
        return repository.list();
    }
     */
}
