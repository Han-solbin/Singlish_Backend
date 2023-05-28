package com.example.singlishbackend.search.service;

import com.example.singlishbackend.search.domain.SearchKeyword;
import com.example.singlishbackend.search.domain.SearchKeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class SearchKeywordService {

    private final SearchKeywordRepository searchKeywordRepository;

    @Autowired
    public SearchKeywordService(final SearchKeywordRepository searchKeywordRepository) { this.searchKeywordRepository = searchKeywordRepository;}

    public List<SearchKeyword> findAll() {
        return searchKeywordRepository.findAll();
    }
}
