
package ejercicioenclase;
import java.util.Scanner; 

public class SerieUno {
 Scanner serie = new Scanner (System.in);
    

 
     public int factorial(int numero){
      int Factorial = 1;
      while(numero !=0){
          Factorial*=numero;
          numero --; 
    } System.out.print("\n el factorial es:"+  Factorial); 
     return 0;
     }
     
     
     
     
     public int tabla(int numero1){
     
     for (int i=1; i <=10; i++){
      System.out.println(numero1+"*"+i+"="+(numero1*i));
     }
     return numero1;
     }
     
         
         
        
         
     }
     
 

    