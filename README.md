# ledger-kata

Practice for backend live-coding interviews: a simple in-memory ledger
system in Java (Maven, JUnit 5).

## Run

    mvn test

## Features

- Account with deposit/withdraw, balance never goes negative
- Ledger: account registration and lookup, race-condition-free via
  ConcurrentHashMap.putIfAbsent
- Custom exceptions: InsufficientFundsException, AccountNotFoundException
