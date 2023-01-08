package model.entities;

import model.exception.RegraNegocioException;

public abstract class Conta {
    private Integer numeroConta;
    private Integer agencia;
    private Double saldo;
    private Cliente cliente;

    public Conta(Integer numeroConta, Integer agencia, Double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Integer getAgencia() {
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
}
