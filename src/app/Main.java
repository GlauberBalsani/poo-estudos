package app;

import model.entities.ContaCorrente;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Abertura da Conta: ");
            System.out.print("Digite o número da conta: ");
            Integer numero = sc.nextInt();
            System.out.print("Digite o código da agência: ");
            String agencia = sc.next();
            System.out.print("Favor realizar deposito: ");
            Double saldo = sc.nextDouble();
            ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, saldo);

            System.out.println(contaCorrente);


            System.out.println();

            System.out.println("Cadastro do Cliente");
            System.out.print("Nome do Cliente: ");
            sc.next();
            String nome = sc.next();
            System.out.print("Email do cliente: ");
            String email = sc.next();
            System.out.print("CPF do cliente: ");
            String cpf = sc.next();
            System.out.print("Data de nascimento: (dd/MM/yyyy): ");
            Date dataNascimento = sdf.parse(sc.next());



        }
        catch (ParseException e) {
            System.out.println("Data de nascimento inválida: ");
        }







        sc.close();

    }
}