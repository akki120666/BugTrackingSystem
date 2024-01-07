package com.bts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bts.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
