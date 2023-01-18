package model.entities;



import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Conta conta;
    private Banco banco;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Cliente(String nome, String email, String cpf, Date dataNascimento, Conta conta, Banco banco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.conta = conta;
        banco.addConta(this);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Dados do cliente: \n" + 
        		"Nome: " +  nome + 
        		"\n" + "Email: " +   email + "\n" +  "Cpf: " + cpf + "\n" + conta + "\n" + "Banco: " +  banco;
    }
}
