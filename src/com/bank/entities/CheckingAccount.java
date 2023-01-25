package com.bank.entities;

import com.bank.interfaces.BankAccount;


public class CheckingAccount implements BankAccount {
    private Integer id;
    private Double balance;
    private Double limit ;
    private Client client;



    public CheckingAccount(int id, Double balance, Client client, double limit) {
        this.id = id;
        this.balance = balance;
        this.client = client;
        this.limit = limit;
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

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Client getClient() {
        return client;
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

    }

    @Override
    public void transfer(double amount, BankAccount account) {

    }
}
