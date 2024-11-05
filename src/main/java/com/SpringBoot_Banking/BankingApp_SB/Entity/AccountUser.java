package com.SpringBoot_Banking.BankingApp_SB.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class AccountUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String email;
	private long phone;

}
