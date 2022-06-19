package Cliente;

import java.util.Comparator;

public class CompararCliente implements Comparator<Cliente>{
    
    private final int mayor = -1;
    private final int igual = 0;
    private final int menor = 1;
    
    
    @Override
    public int compare(Cliente c1, Cliente c2){
        if((compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad()) == menor 
                && compararEdad(c1.getEdad(),c2.getEdad()) == menor) || 
                (compararRequisito(c1.isEmbarazo(),c2.isEmbarazo()) == menor &&
                compararEdad(c1.getEdad(),c2.getEdad()) == menor)){
            return menor;
        }else{
            if(compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad()) != igual){
                return compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad());
            }else if(compararRequisito(c1.isEmbarazo(),c2.isEmbarazo()) != igual){
                return compararRequisito(c1.isEmbarazo(),c2.isEmbarazo());
            }else if(compararEdad(c1.getEdad(),c2.getEdad()) != igual){
                return compararEdad(c1.getEdad(),c2.getEdad());
            }else{
                return igual;
            }
            
        }
    
    }
    
    public int compararRequisito(boolean c1, boolean c2){
        if(c1 == c2){
            return igual;
        }else{
            if(c1 == true && c2 == false)
                return mayor;
            else
                return menor;
        }
    }
    
    public int compararEdad(int c1, int c2){
        if(c1 == c2){
            return igual;
        }else if(c1 > c2){
            return mayor;
        }else{
            return menor;
        }
    }
}
