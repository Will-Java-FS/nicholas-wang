package com.revature.services;

import com.revature.models.Account;
import com.revature.models.Item;

public interface AccountService {

    public Account getAccountByUsername(String username);

    public Account addAccount(Account account);

    public Account getAccountWithItemsById(int id);

    public Account getAccountById(int id);

    public void updateAccount(Account account);
}
