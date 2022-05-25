package com.manytomany.bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String name ;
	private int age ;
	private String email ;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn,inverseJoinColumns = @JoinColumn)
	private List<Cab> cabs ;
	public int getId() {
		return id;
	}
	public List<Cab> getCabs() {
		return cabs;
	}
	public void setCabs(List<Cab> cabs) {
		this.cabs = cabs;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
