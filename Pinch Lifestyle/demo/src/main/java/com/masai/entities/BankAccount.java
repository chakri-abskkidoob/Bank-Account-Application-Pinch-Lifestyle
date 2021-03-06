package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
	
	@Id
	private Integer id;
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
	
	
	
	public BankAccount(int id, String firstName, String lastName, String phoneNumber) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
	}

	public BankAccount() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}
