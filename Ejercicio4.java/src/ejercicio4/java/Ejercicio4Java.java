/*
 * 
 */
package ejercicio4.java;


 import java.util.Scanner;
 
public class Ejercicio4Java {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         double gradosC, gradosF;
         System.out.println("Introduce grados Centígrados:");
         gradosC = sc.nextDouble();
         gradosF = 32 + (9 * gradosC / 5);
         System.out.println(gradosC +" ºC = " + gradosF + " ºF"); 
    
}
}

