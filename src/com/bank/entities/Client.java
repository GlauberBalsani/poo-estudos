package com.bank.entities;

public class Client {
	private Integer id;
    private String name;

    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;


    public Client(Integer id, String name) {
    	this.id = id;
        this.name = name;

    }
    
    public Integer getId() {

        return id;
	}

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
