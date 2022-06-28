package Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
   static Scanner sc = new Scanner(System.in);
   static ArrayList<Integer> numsTelefonos = new ArrayList<>(); 
   
   public static void main(String[] args){
       int contador = 0;
       String numeroTexto = "";
       
       contador = sc.nextInt();
       
       System.out.println("");
       
       while(contador > 0){
           int n = 0;
           n = sc.nextInt();
           
           
           
           for(int i = -1; i < n; i++){
               
               numeroTexto = sc.nextLine();

               numsTelefonos.add(tratarEntrada(numeroTexto));
               //System.out.println("Numero: "+i);
               
               if(i == -1){
                  numsTelefonos.clear();
               }
           }
           
           Collections.sort(numsTelefonos);
           
           /*for(int numero: numsTelefonos){
               System.out.println(numero);
           }*/
           System.out.println("");
           numsRepetidos(numsTelefonos);
           System.out.println("");
           
           contador--;
       }
   }
   
   static int tratarEntrada(String entrada){
       int sum = 0;
       for(int j = 0; j < entrada.length(); j++){
           
           if(entrada.charAt(j) == '-' || entrada.charAt(j) == 'Q' || entrada.charAt(j)== 'Z'){
               continue;
           }else{
                if('0'<=entrada.charAt(j) && entrada.charAt(j)<='9')//number mapping
                    sum=sum*10+entrada.charAt(j)-'0';
                else if('A'<=entrada.charAt(j) && entrada.charAt(j)<='P')//Summarize the law of letter mapping and simplify the code
                    sum=sum*10+(entrada.charAt(j)-'A')/3+2;
                else if('R'<=entrada.charAt(j) && entrada.charAt(j)<='Y')
                    sum=sum*10+(entrada.charAt(j)-'A'-1)/3+2;
           }
       }
       
       return sum;
   }
   
   static void numsRepetidos(ArrayList<Integer> nums){
       int bandera = 0;
       
       for (int i = 0, temporal = nums.get(0), nrepeticion = 0; i < nums.size(); i++) {
           
           if((nums.get(i) != temporal || i == nums.size()) && nrepeticion > 1){
               
               bandera = 1;
               
               System.out.println((temporal/10000)+"-"+(temporal%10000)+" "+nrepeticion);
               
               if(i == nums.size())
                  break;
               
               temporal = nums.get(i);
               nrepeticion = 1;
               
           }else if(nums.get(i) != temporal && nrepeticion == 1){
               temporal = nums.get(i);
           }else{
               nrepeticion++;
           }
           
       }
       
        if(bandera == 0)
            System.out.println("No duplicates.");
    }

}
