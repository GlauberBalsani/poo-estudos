package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private List<Client> clients;
	
	public Bank() {
		
		clients =  new ArrayList<>();
	}

	public void addCliente(Integer id, String name, Integer idConta, Double balance, String accountType) {
		Client client = new Client(id, name);
		if (accountType.equals("universitária")) {
			UniversityAccount account = new UniversityAccount(idConta, balance);
			client.setUniversityAccount(account);
		}
		if (accountType.equals("prime")) {
			PrimeAccount account = new PrimeAccount(idConta, idConta, balance);
			client.setPrimeAccount(account);
		}
		clients.add(client);
	}

	public void printClient() {
		for (Client client : clients) {
			System.out.println("Id: " + client.getId() + ", " + "Nome: " + client.getName());
			PrimeAccount primeAccount = client.getPrimeAccount();
			if (primeAccount != null) {
				System.out.println("Conta Prime: " + primeAccount.getIdConta() + " Saldo: " + primeAccount.getBalance());
			}
			UniversityAccount universityAccount = client.getUniversityAccount();
			if (universityAccount != null) {
				System.out.println("Conta Universitária Id " +  universityAccount.getIdConta() + ", " + " Saldo " + universityAccount.getBalance());
			}
		}
	}

}
