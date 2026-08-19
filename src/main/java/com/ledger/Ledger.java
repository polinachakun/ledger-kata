package com.ledger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ledger {
    private final Map<String, Account> accounts = new ConcurrentHashMap<>();

    public void register(Account account) {
        Account existing = accounts.putIfAbsent(account.getId(), account);
        if (existing != null) {
            throw new IllegalArgumentException("Account with id " + account.getId() + " already exists");
        }
    }

    public Account getAccount(String id) {
        Account account = accounts.get(id);
        if (account == null) {
            throw new AccountNotFoundException(id);
        }
        return account;
    }
}
