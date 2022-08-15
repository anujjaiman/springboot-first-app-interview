package com.springboot.first.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
