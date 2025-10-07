package com.rbt.mvcdemov2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbt.mvcdemov2.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
