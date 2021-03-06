package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Repository.BankAccountDao;
import com.masai.entities.BankAccount;

@RestController
public class BankAccountController {
	
	@Autowired
	private BankAccountDao bankaccountdao;	
	@PostMapping(value="/createaccount")
	public BankAccount saveBankAccount(@RequestBody BankAccount bankaccount) {
		BankAccount newaccount = bankaccountdao.save(bankaccount);
		return newaccount;
	}
	
	@GetMapping("pinchLifeStyle")
	public String sayhi() {
		return "Hello...! Welcome to Pinch LifeStyle.";
	}
	
	@GetMapping("/getaccount")
	public BankAccount getBankAccount() {
		BankAccount b1 = new BankAccount();
		b1.setFirstName("Chakri");
		b1.setLastName("Pasumarthi");
		b1.setPhoneNumber("8374024268");
		b1.setId(1);
		
		return b1;
	}
	
}
