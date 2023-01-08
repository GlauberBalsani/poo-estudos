package model.entities;

import model.exception.RegraNegocioException;

public class ContaCorrente extends Conta {
    private Double limite = 1000.00;
    public ContaCorrente(Integer numeroConta, Integer agencia, Double saldo, Double limite, Cliente cliente) {
        super(numeroConta, agencia, saldo, cliente);
    }


    @Override
    public void saque(Double valor) throws RegraNegocioException {
        super.saque(valor - 2.00);
    }
}
