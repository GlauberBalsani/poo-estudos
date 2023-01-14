package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Cliente;
import model.entities.ContaCorrente;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        ContaCorrente cr = new ContaCorrente(01, "ag1", 1000.0);
        Cliente cliente = new Cliente("Samira", "sami@gmail.com", "222.222.222.22", sdf.parse("01/01/2019"), cr);
        
        System.out.println(cliente);






        sc.close();

    }
}