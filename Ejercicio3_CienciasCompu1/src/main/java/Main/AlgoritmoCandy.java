package Main;

import java.util.Scanner;

public class AlgoritmoCandy {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int filas;
        int columnas;
        int[][] matrizAumentada = null;
        int[] solucionMatriz = null; 
      
        
        do{
            filas = sc.nextInt();
            columnas = sc.nextInt();

      
            if(filas > 0 && columnas > 0){
                matrizAumentada = new int[filas][columnas+2];
                matrizAumentada = leerMatriz(matrizAumentada, filas, columnas);

                matrizAumentada = maxFila(matrizAumentada, filas, columnas);
            
             solucionMatriz = new int[filas+2];
          
             for(int i = 0; i < filas; i++){
               solucionMatriz[i+2] = matrizAumentada[i][columnas+1];
             }

             for(int i = 2; i < (filas+2); i++){
               solucionMatriz[i] = Math.max(solucionMatriz[i-1], 
                       solucionMatriz[i] + solucionMatriz[i-2]);
              
              }
            }

            if(filas > 0 && columnas > 0){
              System.out.println(solucionMatriz[filas+1]);
            }
          
        }while(filas > 0 && columnas > 0);
        
    }
    
    public static int[][] leerMatriz(int[][] matrizAumentada, int filas, 
                                        int columnas){
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matrizAumentada[i][j+2] = sc.nextInt();
            }
        }
        
        
        
        return matrizAumentada;
    }
    
    private static int[][] maxFila(int[][] matriz, int filas, int columnas){
        
      for(int i = 0; i < filas; i++){
        for(int j = 2; j < (columnas+2); j++){
            matriz[i][j] = Math.max(matriz[i][j-1], matriz[i][j] 
                                                    + matriz[i][j-2]);
        }
      }
        
        return matriz;
    }
}

