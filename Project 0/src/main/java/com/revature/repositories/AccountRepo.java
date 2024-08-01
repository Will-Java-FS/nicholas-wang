package com.revature.repositories;

import com.revature.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

    Account findAccountByUsername(String username);
}