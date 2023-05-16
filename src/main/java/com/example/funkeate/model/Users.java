package com.example.funkeate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity 
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String username;
	
	private String nickname;

	private String email;
	
	private String password;
	
	private Date last_login;
	
	private boolean is_superuser;
	
	private boolean is_staff;
	
	private boolean is_active;
	
	private Date date_joined;
	
	private Date created_at;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public boolean isIs_superuser() {
		return is_superuser;
	}

	public void setIs_superuser(boolean is_superuser) {
		this.is_superuser = is_superuser;
	}

	public boolean isIs_staff() {
		return is_staff;
	}

	public void setIs_staff(boolean is_staff) {
		this.is_staff = is_staff;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public Date getDate_joined() {
		return date_joined;
	}

	public void setDate_joined(Date date_joined) {
		this.date_joined = date_joined;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	

}