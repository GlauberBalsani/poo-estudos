package com.bank.entities;

import com.bank.interfaces.BankAccount;

public class SavingsAccount implements BankAccount {
    private Double balance;
    private final Double WITHDRAW_TAX = 1.00;



    public SavingsAccount(Integer id, Double balance, Client client) {
        super(id, amount, client);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Saldo insuficiten");
        }
        this.balance = WITHDRAW_TAX - this.balance + amount;


    }

    @Override
    public void transfer(double amount, BankAccount account) {
        if (amount > this.ba)

    }
}
