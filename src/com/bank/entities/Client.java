package com.bank.entities;



import java.text.SimpleDateFormat;
import java.util.Date;


public class Client {
	private Integer id;
    private String name;
    private String email;
    private String cpf;
    private Date birthDate;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Client(Integer id, String nome, String email, String cpf, Date dataNascimento) {
    	this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }
    
    public Integer getId() {
		return id;
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
