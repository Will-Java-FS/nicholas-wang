package com.revature.services;

import com.revature.models.Account;
import com.revature.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepo.findAccountByUsername(username);
    }

    @Override
    public Account addAccount(Account account) {
        String username = account.getUsername();
        String password = account.getPassword();
        if (!username.isEmpty() && password.length() >= 3) {
            return accountRepo.save(account);
        }

        return null;
    }
}
