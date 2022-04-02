
package ejercicioenclase;
import java.util.Scanner;



public class OperacioesDeLasDosClases {
static  Scanner scanner=new Scanner (System.in);
   
@SuppressWarnings("fallthrough")
    public static void main(String[] args) {
       int opcion=0;
        do  {
            
     
    System.out.print("\n Bienvenidos a calculadora especial:");
    System.out.print("\n 1. factorial ");
    System.out.print("\n 2. tabla de multiplicar");
    System.out.print("\n 3. pares e impares");
    System.out.print("\n 4. dia de la semaana");

     System.out.print("\n Escoja la operacion que desea");
       opcion=scanner.nextInt();
        SerieUno metodo= new SerieUno();
       SerieDos objetoDos = new SerieDos();
      
       
      switch(opcion){
               
         case 1 : 
             System.out.print("digite un numero");
             int numer = scanner.nextInt();
            System.out.println ( metodo.factorial(numer));
            break ;
          
         case 2 :
            System.out.print ("digite un numeros");
            int golpe = scanner.nextInt();
            System.out.println (metodo.tabla(golpe));
            break;
            
        
          case 3: 
         
         int numeral = scanner.nextInt();
              System.out.println (objetoDos.numero(numeral));
              break;
          case 4 :
                  System.out.print("escoge el dia de la semana");
                  int uno= scanner.nextInt();
                  System.out.print(""+objetoDos.dia(uno));
    
     break;  
     
         }      } while (opcion !=5);


    
 }
      }
    
    
