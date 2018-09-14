package com.feifz.dao;



import com.feifz.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
