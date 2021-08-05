package com.example.springTest.repository.jpa;

import com.example.springTest.entity.jpa.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAMemberRepository extends JpaRepository<Member, Long> {
}
