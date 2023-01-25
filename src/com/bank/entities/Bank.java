package com.bank.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<Client>();
    }

   public void addConta(Client client) {
        this.clients.add(client);
    }
    
    @Override
    public String toString() {
    	for (Client c : clients) {
    		System.out.println(clients);
    	}
		return null;
    	
    }
}
