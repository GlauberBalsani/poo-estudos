package model.entities;

import model.exception.RegraNegocioException;

public class ContaCorrente extends Conta  {
    private Double limite = 1000.00;


    public ContaCorrente(Integer numeroConta, String agencia, Double saldo) {

        super(numeroConta, agencia, saldo);

    }

    @Override
    public void saque(Double valor) throws RegraNegocioException {
        super.saque(valor - 2.00);
    }

    @Override
    public String toString() {
        return "Numero da conta: " + getNumeroConta() + " Agência: " + getAgencia() + " Saldo: " + getSaldo();
    }
}
