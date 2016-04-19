/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*lmxkmzxcmklzmcz*/
package projecte_m8;

import java.util.Scanner;

/**
 *
 * @author ferran
 */
public class Projecte_M8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("introdueix 10 valors numerics");
        int n=0;
        int array[]= new int[10];
        int aux=0;
        int aux2=0;
        for (int i = 0; i < array.length; i++) {
            n = entrada.nextInt();
            array[i]=n; 
            if(array[i]>aux){
                aux=array[i];  
                aux2=aux;
            }
            
        }
        System.out.println("El numero mes Gran es "+ aux);
        System.out.println("");
        System.out.println(aux);
        System.out.println("Verifiquem resultats y imprimim en numero mes petit: ");
        for (int j = 0; j < array.length; j++) {
            if(array[j]<aux){
            aux=array[j];
            }
            System.out.println(array[j]);
        }
        System.out.println("");
        System.out.println("Numero mes petit: "+aux);
        System.out.println("Numero mes Gran: "+aux2);
    }
    
}

