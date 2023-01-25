package com.bank.entities;

import model.exception.RegraNegocioException;

public abstract class Conta {
    private Integer numeroConta;
    protected Double saldo;
    private Client client;


    public Conta(Integer numeroConta, Double saldo, Client client) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.client = client;


    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

  

    public Double getSaldo() {
        return saldo;
    }

    public void deposita(Double valor) {
        this.saldo += valor;
    }
    
    public Client getCliente() {
		return client;
	}

    public void saque(Double valor) throws RegraNegocioException {
        if (valor < 0 || valor == null) {
            throw new RegraNegocioException("Favor verificar o valor a ser depositado");
        }
        this.saldo -= valor;
    }
    
    public void transfere(Double valor, Conta conta) throws RegraNegocioException {
    	this.saque(valor);
    	conta.deposita(valor);
    }

    @Override
    public String toString() {
        return "Dados bancários \n" + "Número da Conta: " + numeroConta + "\n" + "\n" + "Saldo: " + saldo;
    }
}
