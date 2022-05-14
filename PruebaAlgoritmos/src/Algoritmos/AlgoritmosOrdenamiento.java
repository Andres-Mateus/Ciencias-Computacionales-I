package Algoritmos;

public class AlgoritmosOrdenamiento {
    private String nomAlgoritmo;
    private int[] arrayNumeros;
    private int operacionesBasicas;
    private double tiempoEstimado;
    
    public AlgoritmosOrdenamiento(){
        this.nomAlgoritmo = "";
        this.arrayNumeros = null;
        this.operacionesBasicas = 0;
        this.tiempoEstimado = 0;
        
    }

    public String getNomAlgoritmo() {
        return nomAlgoritmo;
    }

    public void setNomAlgoritmo(String nomAlgoritmo) {
        this.nomAlgoritmo = nomAlgoritmo;
    }

    public int[] getArrayNumeros() {
        return arrayNumeros;
    }

    public void setArrayNumeros(int[] numeros) {
        this.arrayNumeros = numeros;
    }
    
    
    
    public int[] algoritmoBurbuja(){
        this.tiempoEstimado = System.nanoTime();
        
        int[] numerosOrdenados = this.arrayNumeros;
        int auxiliar;
        
        for(int limit = arrayNumeros.length-1; limit > 0 ; limit--){
            
            for(int firstIndex = 0; firstIndex < limit; firstIndex++){
                
                if(numerosOrdenados[firstIndex] > numerosOrdenados[firstIndex+1]){
                    auxiliar = numerosOrdenados[firstIndex];
                    numerosOrdenados[firstIndex] = numerosOrdenados[firstIndex+1];
                    numerosOrdenados[firstIndex+1] = auxiliar;
                }
                operacionesBasicas++;
            }
        }
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    public int[] algoritmoBurbujaMejorado(){
        this.tiempoEstimado = System.nanoTime();
        
        int[] numerosOrdenados = this.arrayNumeros;
        int auxiliar;
        boolean desorden;
        
        for(int limit = arrayNumeros.length-1; limit > 0 ; limit--){
            desorden = false;
            for(int firstIndex = 0; firstIndex < limit; firstIndex++){
                
                if(numerosOrdenados[firstIndex] > numerosOrdenados[firstIndex+1]){
                    auxiliar = numerosOrdenados[firstIndex];
                    numerosOrdenados[firstIndex] = numerosOrdenados[firstIndex+1];
                    numerosOrdenados[firstIndex+1] = auxiliar;
                    desorden = true;
                }
                operacionesBasicas++;
            }
            
            /*System.out.print("iteración "+operacionesBasicas+": ");
            for(int numero : numerosOrdenados){
                System.out.print(numero+" ");
            }
            System.out.println("");*/
            
            if(!desorden){
                break;
            }
        }
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    public int[] algoritmoSelectionSort(){
        this.tiempoEstimado = System.nanoTime();
        
        int[] numerosOrdenados = this.arrayNumeros;
        
        //Algoritmo
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    public int[] algoritmoQuickSort(){
        this.tiempoEstimado = System.nanoTime();
        
        int[] numerosOrdenados = this.arrayNumeros;
        
        //Algoritmo
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    public int[] algoritmoMergeSort(){
        this.tiempoEstimado = System.nanoTime();
        
        int[] numerosOrdenados = this.arrayNumeros;
        
        //Algoritmo
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    private void resetValues(){
        this.arrayNumeros = null;
        this.operacionesBasicas = 0;
        this.tiempoEstimado = 0;
    }
    
    private double calcularTiempo(double tinicial, double tfinal){
        return ((tfinal-tinicial)/1000000);
    }
    
    private void mostrarResultados(){
        System.out.println("Algoritmo: "+ this.nomAlgoritmo 
                                +"\nOperaciones Basicas: "+ this.operacionesBasicas
                                +"\nTiempoEstimado: "+ this.tiempoEstimado+" ms"
                                +"\n--------------------------------------");
    }
}
