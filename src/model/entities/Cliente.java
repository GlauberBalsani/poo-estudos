package model.entities;



import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Cliente(String nome, String email, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
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
        return "Nome: " +  nome + "Email: " +   email + "Cpf: " + cpf;
    }
}