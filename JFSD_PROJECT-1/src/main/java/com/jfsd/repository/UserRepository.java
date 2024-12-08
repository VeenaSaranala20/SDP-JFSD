package com.jfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jfsd.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
