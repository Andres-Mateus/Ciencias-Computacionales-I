package arbolesynodos;

import Arboles.*;

public class ArbolesYNodos {
    
    public static void main(String[] args) {
       
        ArbolOrdenamiento<Integer> arbol = new ArbolOrdenamiento<>();
        
        arbol.insertarNodoIterativo(8);
        
        arbol.insertarNodoIterativo(4);
        arbol.insertarNodoRecursivo(arbol.getRaiz(), 10);
        NodoOrdenamiento<Integer> t = arbol.insertarNodoRecursivo(arbol.getRaiz(), 12);
        arbol.insertarNodoRecursivo(arbol.getRaiz(), 15);
        arbol.insertarNodoRecursivo(arbol.getRaiz(), 20);
        arbol.insertarNodoRecursivo(arbol.getRaiz(), -1);
        arbol.insertarNodoIterativo(1);
        
        arbol.imprimir();
        
        /*
        arbol.preOrden(arbol.getRaíz());
        System.out.println("");
        arbol.inOrden(arbol.getRaíz());
        System.out.println("");
        arbol.inOrdenInverso(arbol.getRaíz());
        System.out.println("");
        arbol.postOrden(arbol.getRaíz());
        System.out.println("");
        */
        
        System.out.println("\n"+arbol.altura(t));
        System.out.println(arbol.profundidad(t));
    }
    
}
