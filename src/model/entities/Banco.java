package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
}
