package com.ledger;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String accountId) {
        super("Account " + accountId + " is not found");
    }
}
