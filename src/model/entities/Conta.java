package model.entities;

import model.exception.RegraNegocioException;

public abstract class Conta {
    private Integer numeroConta;
    private String agencia;
    protected Double saldo;


    public Conta(Integer numeroConta, String agencia, Double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;


    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposita(Double valor) {
        this.saldo += valor;
    }

    public void saque(Double valor) throws RegraNegocioException {
        if (valor < 0 || valor == null) {
            throw new RegraNegocioException("Favor verificar o valor a ser depositado");
        }
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
