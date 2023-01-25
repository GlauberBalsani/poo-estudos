package com.bank.app;


import com.bank.entities.Bank;

public class Main {
    public static void main(String[] args)  {

        Bank bank =  new Bank();

        bank.addClient(1,"Glauber Balsani",200,2000.0,"checking",1000.0,0.0);
        bank.addClient(2,"Samira Balsani",221,500.0,"savings", 200.0,0.0);



        bank.printClients();


        
        

        
       
        		
        
        
        
        
        









    }
}