package com.ledger;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String accountId, double requested, double available) {
        super("Insufficient funds on account " + accountId +
                ": requested " + requested + ", available " + available);
    }
}
