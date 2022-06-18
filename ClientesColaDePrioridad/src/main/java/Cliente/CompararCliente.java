package Cliente;

import java.util.Comparator;

public class CompararCliente implements Comparator<Cliente>{
    
    @Override
    public int compare(Cliente c1, Cliente c2){
        if((compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad()) == -1 
                && compararEdad(c1.getEdad(),c2.getEdad()) == -1) || 
                (compararRequisito(c1.isEmbarazo(),c2.isEmbarazo()) == -1 &&
                compararEdad(c1.getEdad(),c2.getEdad()) == -1)){
            return -1;
        }else{
            if(compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad()) != 0){
            return compararRequisito(c1.isDiscapacidad(),c2.isDiscapacidad());
            }else if(compararRequisito(c1.isEmbarazo(),c2.isEmbarazo()) != 0){
                return compararRequisito(c1.isEmbarazo(),c2.isEmbarazo());
            }else if(compararEdad(c1.getEdad(),c2.getEdad()) != 0){
                return compararEdad(c1.getEdad(),c2.getEdad());
            }else{
                return 0;
            }
            
        }
    
    }
    
    public int compararRequisito(boolean c1, boolean c2){
        if(c1 == c2){
            return 0;
        }else{
            if(c1 == true && c2 == false)
                return -1;
            else
                return 1;
        }
    }
    
    public int compararEdad(int c1, int c2){
        if(c1 == c2){
            return 0;
        }else if(c1 > c2){
            return -1;
        }else{
            return 1;
        }
    }
}
