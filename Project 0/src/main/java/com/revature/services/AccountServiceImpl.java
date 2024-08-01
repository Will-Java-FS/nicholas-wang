package com.revature.services;

import com.revature.models.Account;
import com.revature.models.Item;
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

    @Override
    public Account getAccountWithItemsById(int id) {
        return accountRepo.findAccountWithItemsById(id);
    }

    @Override
    public Account getAccountById(int id) {
        return accountRepo.findById(id).orElse(null);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepo.save(account);
    }
}
