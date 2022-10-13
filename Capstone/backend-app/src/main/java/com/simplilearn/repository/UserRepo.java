package com.simplilearn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.bean.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}

