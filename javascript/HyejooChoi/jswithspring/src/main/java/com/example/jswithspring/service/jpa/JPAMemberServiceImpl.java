package com.example.jswithspring.service.jpa;

import com.example.jswithspring.controller.vue.jpa.request.MemberRequest;
import com.example.jswithspring.entity.jpa.Member;
import com.example.jswithspring.entity.jpa.MemberAuth;
import com.example.jswithspring.repository.jpa.JPAMemberAuthRepository;
import com.example.jswithspring.repository.jpa.JPAMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JPAMemberServiceImpl implements JPAMemberService {

    @Autowired
    private JPAMemberRepository memberRepository;

    @Autowired
    private JPAMemberAuthRepository memberAuthRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(MemberRequest memberRequest) throws Exception {
        String encodeedPassword = passwordEncoder.encode(memberRequest.getPassword());
        memberRequest.setPassword(encodeedPassword);

        MemberAuth authEntity = new MemberAuth(memberRequest.getAuth());
        Member memberEntity = new Member(memberRequest.getUserId(), memberRequest.getPassword());
        memberEntity.addAuth(authEntity);

        memberRepository.save(memberEntity);
    }


    @Override
    public void login(Member member) throws Exception {
        Optional<Member> loginMember = memberRepository.findByUserId(member.getUserId());

        if (loginMember == null)
        {
            log.info("login(): 그런 사람 없다.")
            return false;
        }

        Member loginMember = maybeMember.get();

        if (!passwordEncoder.matches(member.getPassword(), loginMember.getPassword()))
        {
            log.info("login(): 비밀번호 잘못 입력하였습니다.")
            return false;
        }

        return false;

    }

 /*
    @Override
    public List<Member> list() throws Exception {
        return repository.list();
    }
     */

    @Override
    public Optional<Member> findByAuth(Long memberNo) {
        return memberRepository.findByAuth(memberNo);
    }
}
