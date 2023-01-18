package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Banco;
import model.entities.Cliente;
import model.entities.ContaCorrente;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        ContaCorrente cr = new ContaCorrente(01, "ag1", 1000.0);
        ContaCorrente cr2 =  new ContaCorrente(01, "ag01", null);
        Banco bradesco =  new Banco();
        
        Cliente cliente = new Cliente("Samira", "sami@gmail.com", "222.222.222.22", sdf.parse("01/01/2019"), cr, bradesco);
        Cliente cliente2 = new Cliente("Glauber", "glauber@gmail.com", "323.323.3232.33", sdf.parse("29/07/1990"), cr2, bradesco);
        
        		
        
        
        
        
        
        System.out.println(bradesco);






        sc.close();

    }
}