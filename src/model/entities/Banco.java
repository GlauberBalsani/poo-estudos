package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }
}
