package pruebaalgoritmos;

import ManejoArchivos.*;
import Algoritmos.*;
import java.io.IOException;

public class PruebaAlgoritmos {

    public static void main(String[] args) throws IOException {
        int[] nums100 = new int[100];
        int[] nums1000 = new int[1000];
        int[] nums10000 = new int[10000];
        int[] numsOrganizados;
        
        LeerArchivo leerNums = new LeerArchivo();
        AlgoritmosOrdenamiento organizarNums = new AlgoritmosOrdenamiento();
        
        
        nums100 = leerNums.leerDatosEnteros("C:\\Users\\andresfelipe\\Documents"
                                        + "\\NetBeansProjects\\PruebaAlgoritmos"
                                        + "\\src\\ArchivosDeNumeros\\T100.txt", nums100);
        
        nums1000 = leerNums.leerDatosEnteros("C:\\Users\\andresfelipe\\Documents"
                                        + "\\NetBeansProjects\\PruebaAlgoritmos"
                                        + "\\src\\ArchivosDeNumeros\\T1000.txt", nums1000);
        
        nums10000 = leerNums.leerDatosEnteros("C:\\Users\\andresfelipe\\Documents"
                                        + "\\NetBeansProjects\\PruebaAlgoritmos"
                                        + "\\src\\ArchivosDeNumeros\\T10000.txt", nums10000);
        
       //--------------Organizar numeros----------------
       
       //Algoritmo Burbuja
       
       organizarNums.setNomAlgoritmo("Algoritmo Burbuja");
       organizarNums.setArrayNumeros(nums100);
       
       numsOrganizados = organizarNums.algoritmoBurbuja();
       
       organizarNums.setArrayNumeros(nums1000);
       
       numsOrganizados = organizarNums.algoritmoBurbuja();
       
       organizarNums.setArrayNumeros(nums10000);
       
       numsOrganizados = organizarNums.algoritmoBurbuja();
       
       /*for(int i = 0; i < numsOrganizados.length; i++){
           System.out.println("Numero "+i+": "+numsOrganizados[i]);
       }*/
       
       //Algoritmo Burbuja Mejorado
       System.out.println("");
       organizarNums.setNomAlgoritmo("Algoritmo Burbuja Mejorado");
       organizarNums.setArrayNumeros(nums100);
       
       numsOrganizados = organizarNums.algoritmoBurbujaMejorado();
       
       
       organizarNums.setArrayNumeros(nums1000);
       
       numsOrganizados = organizarNums.algoritmoBurbujaMejorado();
       
       organizarNums.setArrayNumeros(nums10000);
       
       numsOrganizados = organizarNums.algoritmoBurbujaMejorado();
       
       
       //Algoritmo Selection Sort
    
    
    
       //Algoritmo Quick Sort
       
       
       //Algoritmo Merge Sort
       System.out.println("");
       organizarNums.setNomAlgoritmo("Algoritmo Merge Sort");
       organizarNums.setArrayNumeros(nums100);
       
       numsOrganizados = organizarNums.algoritmoMergeSort();
       
       
       organizarNums.setArrayNumeros(nums1000);
       
       numsOrganizados = organizarNums.algoritmoMergeSort();
       
       organizarNums.setArrayNumeros(nums10000);
       
       numsOrganizados = organizarNums.algoritmoMergeSort();
       
       
    }
    
}
