package com.bank.interfaces;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount,BankAccount account );
}
