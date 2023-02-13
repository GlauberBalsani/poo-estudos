package model.entities;

import exception.LimitWithdrawException;

public class UniversityAccount extends Account {

	private final Double TAX_CORRECTION = 5.0;

	public UniversityAccount(Integer idConta, Double balance) {
		super(idConta, balance);
		
	}

	@Override
	public void withdraw(double value) {
		if (value > 1000)
			throw new LimitWithdrawException("Valor não permitido para essa conta");
		this.balance -= value + TAX_CORRECTION;
	}

}
