package com.rbt.relationaldemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rbt.relationaldemo.entity.BankAccount;
import com.rbt.relationaldemo.entity.UserDetail;
@Repository
public interface UserDetailRepo extends JpaRepository<UserDetail, Integer>{
//	@Query("SELECT b FROM BankAccount b WHERE b.accountType = :accountType")
//	public List<BankAccount> findUsersWithAccountType(@Param("accountType") String accountType);}
	@Query("SELECT u FROM UserDetail u JOIN FETCH u.listAccounts b WHERE b.accountType = :accountType")
	public List<UserDetail> findUserDetailsAndBankAccountsByAccountType(@Param("accountType") String accountType);


	@Query("SELECT u FROM UserDetail u JOIN FETCH u.listAccounts b WHERE u.id = :id")
	public List<UserDetail> findUserDetailsByUserId(@Param("id") int id);

}