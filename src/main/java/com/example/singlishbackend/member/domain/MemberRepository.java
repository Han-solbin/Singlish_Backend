package com.example.singlishbackend.member.domain;

import com.example.singlishbackend.member.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member save(Member member);
    default Member getById(final Long id){
        return getById(id);
    }
}
