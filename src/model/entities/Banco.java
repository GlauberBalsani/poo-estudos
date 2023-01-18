package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<Cliente>();
    }

   public void addConta(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    @Override
    public String toString() {
    	for (Cliente c :  clientes) {
    		System.out.println(clientes);
    	}
		return null;
    	
    }
}
