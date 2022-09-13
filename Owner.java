package com.ezdesign.cardatabase.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerid;
	private String firstname,lastname;
	
	public Owner() {}
	
	public Owner(String firstname,String lastname) {
		super();
		this.firstname =firstname;
		this.lastname = lastname;
	}
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="car_owner")
	
	private Set<Car> cars1 = new HashSet<Car>();
	
	public Set <Car> getCars1(){
		return cars1;
	}
	public void setCars(Set<Car>cars) {
		this.cars1 = cars;
	}

	public long getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
