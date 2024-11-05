package com.SpringBoot_Banking.BankingApp_SB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot_Banking.BankingApp_SB.Entity.AccountUser;

public interface BankingRepository extends JpaRepository<AccountUser, Integer> {

}
