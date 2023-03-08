
 
// escribir un programa que pida dos numeros entero por teclado y calcular la suma de los dos.El programa  debera despues mostrar el resultado de la suma 
package primerejercicico;

import java.util.Scanner;

public class java {
    
 public static void main(String[] args){
Scanner teclado = new Scanner (System.in);
int num1,num2;

System.out.println("ingrese un numero");
num1= teclado.nextInt();

System.out.print("ingrese otro numero");
num2=teclado.nextInt();

System.out.println("La suma de los numero es " + (num1+num2));
        


        
    
            
            
    
}
}