package com.example.singlishbackend.search.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Setter
@Table(name = "search_keywords")
@NoArgsConstructor
@DynamicUpdate
@EqualsAndHashCode(of = "id")
public class SearchKeyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length=10)
    private String searchKeyword;
}
