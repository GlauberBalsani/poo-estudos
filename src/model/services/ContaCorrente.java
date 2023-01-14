package model.services;

import model.entities.Conta;

public class ContaCorrente extends Conta implements TaxaServicos {

	public ContaCorrente(Integer numeroConta, String agencia, Double saldo) {
		super(numeroConta, agencia, saldo);
		
	}

	@Override
	public double getTaxa() {
		return super.saldo * 0.01;
	}
	
	
	
	
	
	

}
