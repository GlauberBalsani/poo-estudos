package model.entities;

import exception.BusinesException;
import exception.LimitWithdrawException;

public abstract class Account {

	private Integer idConta;
	protected Double balance;

	public Account(Integer idConta, Double balance) {
		this.idConta = idConta;
		this.balance = balance;

	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(double value) {
		if (value <= 0)
			throw new IllegalArgumentException("Valor não informado");
		this.balance += value;

	}

	public void withdraw(double value) {
		if (this.balance >= value)
			this.balance -= value;
		throw new LimitWithdrawException("Valor não permitido");

	}

	public void transfer(double value, Account account) {
		if (value >= this.balance)
			withdraw(value);
		account.deposit(value);
		throw new BusinesException(null);
	}

	@Override
	public String toString() {
		return "Account [idConta=" + idConta + ", balance=" + balance + "]";
	}

}
