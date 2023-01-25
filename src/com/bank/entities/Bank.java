package com.bank.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank() {

        clients = new ArrayList<Client>();
    }

    public void addClient(int id, String name, int accountId, double balance, String accountType, double limit, double interest) {
        Client client = new Client(id, name);
        if (accountType.equals("checking")) {
            CheckingAccount account = new CheckingAccount(accountId, balance, client, limit);
            client.setCheckingAccount(account);
        } else if (accountType.equals("savings")) {
            SavingsAccount account = new SavingsAccount(accountId, balance, client, interest);
            client.setSavingsAccount(account);
        }
        clients.add(client);
    }
    public void printClients() {
        for (Client client : clients) {
            System.out.println("Cliente: " + client.getName());
            CheckingAccount checkingAccount = client.getCheckingAccount();
            if (checkingAccount != null) {
                System.out.println("Conta Corrente: " + checkingAccount.getId() + " Limite: " + checkingAccount.getLimit());
            }
            SavingsAccount savingsAccount = client.getSavingsAccount();
            if (savingsAccount != null) {
                System.out.println("Conta Poupança: " + savingsAccount.getId() + " Rendimento: " + savingsAccount.getInterest());
            }
        }
    }
}
