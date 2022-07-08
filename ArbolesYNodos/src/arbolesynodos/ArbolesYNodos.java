package arbolesynodos;

import Arboles.*;

public class ArbolesYNodos {
    
    public static void main(String[] args) {
       
        ArbolOrdenamiento<Integer> arbol = new ArbolOrdenamiento<>();
        
        arbol.insertarNodoIterativo(8);
        
        arbol.insertarNodoIterativo(4);
        arbol.insertarNodoRecursivo(arbol.getRaíz(), 10);
        arbol.insertarNodoRecursivo(arbol.getRaíz(), 12);
        arbol.insertarNodoIterativo(1);
        
        arbol.preOrden(arbol.getRaíz());
        
    }
    
}
