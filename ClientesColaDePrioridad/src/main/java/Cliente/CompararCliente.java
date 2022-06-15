package Cliente;

import java.util.Comparator;

public class CompararCliente implements Comparator<Cliente>{
    
    @Override
    public int compare(Cliente c1, Cliente c2){
        if(c1.isDiscapacidad() == c2.isDiscapacidad() && 
                c1.isEmbarazo() == c2.isEmbarazo() && 
                c1.getEdad() == c2.getEdad()){
            return 0;
        }else{
            return 1;
        }
    }
    
    public int compararDiscapacidad(boolean c1, boolean c2){
        if(c1 == c2){
            return 0;
        }else{
            return 1;
        }
    }
}
