package com.example.jumpee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jumpee.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT email FROM User WHERE email = ?1")
	public User findByEmail(String email);
	
//	@Query("SELECT verificationCode FROM User WHERE verificationCode = ?1")
//	public User findByVerificationCode(String code);
}
