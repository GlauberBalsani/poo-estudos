package com.bank.entities;

import com.bank.interfaces.BankAccount;
import model.exception.RegraNegocioException;

public class CheckingAccount implements BankAccount {
    private Double balance;
    private Double limite ;



    public CheckingAccount(Double limit) {

        this.limite = limit;

    }


    @Override
    public String toString() {
        return super.toString();
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
