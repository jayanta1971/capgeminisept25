package com.rbt.springsecv2.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_cred")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password;

    public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}

	public UserEntity(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	 

    
}