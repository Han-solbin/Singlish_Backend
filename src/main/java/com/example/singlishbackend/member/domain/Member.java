package com.example.singlishbackend.member.domain;

import java.util.Collection;
import java.util.Collections;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Getter
@Setter
@Entity
@Table(name = "members")
@NoArgsConstructor
@DynamicUpdate // JPA Entity에 사용하는 어노테이션으로, 실제 값이 변경된 컬럼으로만 update 쿼리를 만드는 기능이다. DynamicUpdate는 성능상 손해가 있다. 몇몇개의 컬럼만 자주 업데이트 하는 경우에 사용한다.
@EqualsAndHashCode(of = "id") // equals 메소드와 hashcode 메소드 (꼭 같이 재정의해야 함)
public class Member implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private boolean isDeleted;
    @Column(nullable = false, length = 20)
    private String password;
    @Column(nullable = false, length = 20)
    private String userId;
    @Column(nullable = false, length = 12, unique = true)
    private String userName;
    @Column(nullable = false)
    private String profileImg_Url;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    } //이부분 처리하는거 이해해야함
    public Long getId() {
        return id;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return userName;
    }
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void delete() {
        isDeleted = true;
    }
}