package app;

import model.entities.Bank;
import model.entities.Client;
import model.entities.UniversityAccount;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCliente(1, "Glauber Balsani", 01, 2000.0, "universitária");
		
		bank.printClient();
		

	}
	
	

}
