package com.bank.app;

import com.bank.entities.CheckingAccount;
import com.bank.entities.Client;

public class TestServices {
    public static void main(String[] args) {
        Client client = new Client(11, "Glauber Balsani");
        CheckingAccount checkingAccount = new CheckingAccount(1,2000.0, client, 200.0);
    }
}
