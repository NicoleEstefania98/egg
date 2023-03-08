package prueba.java;

 class PruebaJava { //varaibles
// comentarios
     /**
      * 
      * @param args 
      */
     
     /*
     
     */
    
    public static void main(String[] args) {
        
        int telefono = 4545454;
        char letra = 'S';
        float peso = 65.2F;
        double ngrade = 76.21212454;
        
        System.out.println("esto es un telefono: " + telefono); //sout es la abreviacion de System.out.println
        System.out.println("esto es una letra " + letra);
        System.out.println("esto es una peso " + peso);
        System.out.println("ngrande es " + ngrade);
        
        
        
       //Operadores aritmeticos
       int num1 = 5;
       int num2 = 4;
       
       //imprimir
       
       System.out.println("esto es una suma: " + (num1 + num2));
       System.out.println("esto es una resta: " + (num1 - num2));
       System.out.println("esto es una multiplicacion: " + (num1 * num2));
       System.out.println("esto es una divicion : " + (num1 / num2));
       System.out.println("esto es un modulo (mod): " + (num1 % num2));
       
       //operaciones de asisgancion
       //simple
       int a = 6;
       int b = 5;
       
       a = b;
       
       System.out.println("a = " +  a);
       
       //segundo ejemplo- compuestas
       //simplicado o optimizado
       
       int t=5, r=10, c=3, d=8;
       
       t = t +5;
       r = r - 10;
       c = c / 3;
       d= d * 8;
       
       //imrpimir
       System.out.println("t = " + t);
       System.out.println("r = " + r);
       System.out.println("c = " + c);
       System.out.println("d = " + d);
       
       //Operadores racionales falso o verdadero /false o true
       
       int f = 10;
       int h = 5;
       //return devuelve 
       System.out.println("f = h " + (f == h));//identico o igual 
       System.out.println("f < h " + (f < h));//menor que
       System.out.println("f <= h " + (f<= h));//menor igual que
       System.out.println("f > h " + (f>h));//mayor que
       System.out.println("f >= h " + (f>=h));//mayor igual que
       System.out.println("f != h " + (f!=h));//distinto o no identico
       
       
       
       
    //operadores logicos
    
    //primera variable
    boolean Valor1 = true;
    
    //segunda variable
    boolean Valor2 = true;
    
    //tercera varaible
    boolean Valor3 = true;
    
    //cuarta varaible
    boolean Valor4 = false;
    
    //imprimir
    //opradores logicos && (and) y
    System.out.println("Primer resultado " + (Valor1 && Valor2)); // true
    System.out.println("Segundo resultado" + (Valor3 && Valor4)); //false
    
    //operadores logicos || (or) o 
    System.out.println("Tercer resultado " + (Valor1 || Valor2)); // true
    System.out.println("Cuarto resultado " + (Valor1  || Valor3)); // true
    
    //operadore logicos ! 
    System.out.println("Quinto valor " + (!Valor1)); //false
    System.out.println("Sexto valor " + (!Valor4));//true
    
    
    }
    
}


