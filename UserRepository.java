package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {//SiteUser의 기본키 타입은 Long
	Optional<SiteUser> findByUsername(String username);//사용자 ID로 SiteUser엔티티를 조회하는 findByUsername메서드 추가
}
