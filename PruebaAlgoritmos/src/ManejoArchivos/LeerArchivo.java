package ManejoArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    
    public LeerArchivo(){
        
    }
    
    public int[] leerDatosEnteros(String ruta, int[] numeros) throws IOException{
        
        try(FileReader entrada = new FileReader(ruta)){
            int contador = 0;
            String sCadena;
            String numero = "";
            
            BufferedReader bf = new BufferedReader(entrada);
            
            while((sCadena = bf.readLine()) != null){
                
                try{

                    numeros[contador] = Integer.parseInt(sCadena);

                    //System.out.println("numero "+contador+":"+numeros[contador]);
                    contador++;

                }catch(NumberFormatException e){
                    continue;
                }
            }
            
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo.");
        
        }
        return numeros;
    }
}
