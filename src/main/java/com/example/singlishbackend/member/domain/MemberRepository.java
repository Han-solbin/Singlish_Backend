package com.example.singlishbackend.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.singlishbackend.member.domain.Member;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    default Member getById(final Long id){
        return getById(id);
    }
}
