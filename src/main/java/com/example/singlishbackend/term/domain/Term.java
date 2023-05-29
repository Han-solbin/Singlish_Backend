package com.example.singlishbackend.term.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "terms")
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Boolean isMandatory;
    @Column(nullable = true)
    private String imgUrl;
    @Column(nullable = true)
    private String body;

    public Optional<String> getImgUrl() {
        return Optional.ofNullable(imgUrl); // or provide a default value instead of an empty string
    }
}
