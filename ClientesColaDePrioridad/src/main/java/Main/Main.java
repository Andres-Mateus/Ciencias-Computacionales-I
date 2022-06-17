package Main;

import java.util.ArrayList;
import Cliente.Cliente;
import Cliente.CompararCliente;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Cliente c1 = new Cliente("A", false, false, 60);
        Cliente c2 = new Cliente("B", false, false, 30);
        Cliente c3 = new Cliente("C", true, false, 35);
        Cliente c4 = new Cliente("D", true, true, 30);
        Cliente c5 = new Cliente("E", true, true, 70);
        Cliente c6 = new Cliente("F", false, true, 65);
        Cliente c7 = new Cliente("G", false, true, 30);
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        clientes.add(c7);
        
        Collections.sort(clientes, new CompararCliente());
        
        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
}
