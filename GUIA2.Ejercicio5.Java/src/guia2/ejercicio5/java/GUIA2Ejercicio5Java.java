/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejercicio5.java;

import java.util.Scanner;
 
public class GUIA2Ejercicio5Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero=input.nextInt();
        System.out.println("el doble de" + numero+ "es:" + numero*2 );
        System.out.println("el triple de " + numero + "es:" + numero*3);
        System.out.println("La raiz de " + numero + " es: " + Math.sqrt(numero));     
             
        
        
    }
    
}
