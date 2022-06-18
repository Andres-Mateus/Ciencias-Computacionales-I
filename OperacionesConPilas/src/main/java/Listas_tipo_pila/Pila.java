package Listas_tipo_pila;

import javax.swing.JOptionPane;


public class Pila {
    
    private Nodo ultimoValorIngresado;
    private int tamanio;
    String lista;
    
    public Pila(){
        this.ultimoValorIngresado = null;
        this.tamanio = 0;
        this.lista = "";
    }
    
    public boolean pilaVacia(){
        return this.ultimoValorIngresado == null;
    }
    
    public void insertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.setSiguiente(this.ultimoValorIngresado);
        this.ultimoValorIngresado = nuevoNodo;
        this.tamanio++;
        
    }
    
    public int eliminarNodo(){
        int auxiliar = this.ultimoValorIngresado.getValor();
        this.ultimoValorIngresado = this.ultimoValorIngresado.getSiguiente();
        this.tamanio--;
        return auxiliar;
        
    }
    
    public int nostrarUltimoValorIngresado(){
        return this.ultimoValorIngresado.getValor();
    }
    
    public int tamanioPila(){
        return tamanio;
    }
    
    public void vaciarPila(){
        while(!pilaVacia()){
            eliminarNodo();
        }
    }
    
    public void mostarValoresPila(){
        Nodo recorrido = this.ultimoValorIngresado;
        
        while(recorrido != null){
            lista += recorrido.getValor()+ "\n";
            recorrido = recorrido.getSiguiente();
        }
        
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
    
}
