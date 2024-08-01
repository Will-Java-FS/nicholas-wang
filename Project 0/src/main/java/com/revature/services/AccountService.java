package com.revature.services;

import com.revature.models.Account;

public interface AccountService {

    public Account getAccountByUsername(String username);

    public Account addAccount(Account account);

}
