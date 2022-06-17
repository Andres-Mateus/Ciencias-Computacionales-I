package Main;

import java.util.ArrayList;
import Cliente.Cliente;
import Cliente.CompararCliente;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Cliente c1 = new Cliente("Rosio", false, false, 35);
        Cliente c2 = new Cliente("Julian", true, false, 65);
        Cliente c3 = new Cliente("Amanda", false, true, 22);
        Cliente c4 = new Cliente("Rojelio", true, false, 30);
        Cliente c5 = new Cliente("Lilia", true, true, 60);
        Cliente c6 = new Cliente("Lilia", false, false, 60);
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        
        Collections.sort(clientes, new CompararCliente());
        
        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
}
