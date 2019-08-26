package com.ujian.UjianWebService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "user")
public class User {

	@Id
	private int id;
	@Column
	private String username;
	@Column
	private String email;
	@OneToMany(mappedBy = "user")
	private List<Personel> personel;

	
	public User() {
		this.personel = new ArrayList<Personel>();
	}
	public User(int id,int user_id) {
		this.id = id;
		this.username = username;
	}
	public List<Personel> getPersonel() {
		return personel;
	}

	public void setPersonel(List<Personel> personel) {
		this.personel = personel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}