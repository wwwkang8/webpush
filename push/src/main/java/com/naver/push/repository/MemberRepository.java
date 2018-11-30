package com.naver.push.repository;

import com.naver.push.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMemId(String userId);

}
