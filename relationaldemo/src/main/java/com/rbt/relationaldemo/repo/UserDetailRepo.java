package com.rbt.relationaldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbt.relationaldemo.entity.UserDetail;
@Repository
public interface UserDetailRepo extends JpaRepository<UserDetail, Integer>{

}
