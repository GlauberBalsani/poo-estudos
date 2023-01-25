package com.bank.entities;

import com.bank.interfaces.BankAccount;

public class SavingsAccount implements BankAccount {
    private Integer id;
    private Double balance;
    private Double interest;
    private Client client;
    private final Double WITHDRAW_TAX = 1.00;


    public SavingsAccount(Integer id, Double balance, Client client, Double interest) {
        this.id = id;
        this.balance = balance;
        this.client = client;
        this.interest = interest;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (amount > this.balance) {
            throw new IllegalArgumentException("Transação não realizada");
        }
        withdraw(amount + WITHDRAW_TAX) ;
        account.deposit(amount);

    }
}
