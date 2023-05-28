package com.example.singlishbackend.search.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchKeywordRepository extends JpaRepository <SearchKeyword, Long> {
}
