package com.SpringBoot_Banking.BankingApp_SB.Dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AccountDto {
	private int Id;
	private String name;
	private String email;
	private long phone;
	
	

}
