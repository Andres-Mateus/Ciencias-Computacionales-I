package Algoritmos;

public class AlgoritmosOrdenamiento {
    private String nomAlgoritmo;
    private int[] arrayNumeros;
    private int operacionesBasicas;
    private long tiempoEstimado;
    
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
        numerosOrdenados = mergeSort(numerosOrdenados);
        
        this.tiempoEstimado = calcularTiempo(this.tiempoEstimado, System.nanoTime());
        
        mostrarResultados();
        resetValues();
        return numerosOrdenados;
    }
    
    private int[] mergeSort(int[] arregloNums){
        this.operacionesBasicas++;
        if(arregloNums.length <= 1){
            return arregloNums;
        }else{
            
            int[] derecha;
            int[] izquierda;

            derecha = new int[arregloNums.length / 2];

            if(arregloNums.length % 2 == 0){
                izquierda = new int[arregloNums.length/2];
            }else{
                izquierda = new int[(arregloNums.length/2+1)];
            }

            int i;

            for(i = 0; i < izquierda.length; i++){

                izquierda[i] = arregloNums[i];
            }

            int z = 0;

            for(int j = i; j < arregloNums.length; j++){
                derecha[z] = arregloNums[j];
                z++;
            }

            //Recursividad

            int [] arrayOrdenado;
            arrayOrdenado = Merge(mergeSort(izquierda), mergeSort(derecha));

            return arrayOrdenado;
        }
    }
    
    private int[] Merge(int[] array1, int[] array2){
        
        int i = 0;
        int j = 0;
        
        int[] arrayOrdenado = new int[array1.length + array2.length];
        
        for (int k = 0; k < arrayOrdenado.length; k++) {
            this.operacionesBasicas++;
            if (array1[i] > array2[j]) {
                
                arrayOrdenado[k] = array2[j];
                j++;
            }else{
                
                arrayOrdenado[k] = array1[i];
               i++;
            }
            
            if (i == array1.length) {
                k++;
                
                for (j = j; j < array2.length; j++) {
                    arrayOrdenado[k] = array2[j];
                    k++;
                   
                }
            }else if(j == array2.length){
                k++;
                
                 for (i = i; i < array1.length; i++) {
                    arrayOrdenado[k] = array1[i];
                    k++;
                    
                }
            }
        }
        
        
        return arrayOrdenado;
    }
    
    private void resetValues(){
        this.arrayNumeros = null;
        this.operacionesBasicas = 0;
        this.tiempoEstimado = 0;
    }
    
    private long calcularTiempo(long tinicial, long tfinal){
        return (tfinal-tinicial);
    }
    
    private void mostrarResultados(){
        System.out.println("Algoritmo: "+ this.nomAlgoritmo 
                                +"\nOperaciones Básicas: "+ this.operacionesBasicas
                                +"\nTiempoEstimado: "+ this.tiempoEstimado+" ns"
                                +"\n--------------------------------------");
    }
}
