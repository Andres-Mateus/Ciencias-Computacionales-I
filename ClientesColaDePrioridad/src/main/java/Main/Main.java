package Main;

import java.util.*;
import Cliente.Cliente;
import Cliente.CompararCliente;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        PriorityQueue<Cliente> clientes = new PriorityQueue<Cliente>(new CompararCliente());
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        listaClientes.add(new Cliente("A", false, false, 60));
        listaClientes.add(new Cliente("B", false, false, 30));
        listaClientes.add(new Cliente("C", true, false, 35));
        listaClientes.add(new Cliente("D", true, true, 30));
        listaClientes.add(new Cliente("E", true, true, 70));
        listaClientes.add(new Cliente("F", false, true, 65));
        listaClientes.add(new Cliente("G", false, true, 30));
        
        for(Cliente cliente: listaClientes){
            clientes.add(cliente);
        }
        
        while(!clientes.isEmpty()){
            System.out.println(clientes.poll());
        }
        
        
    }
}
