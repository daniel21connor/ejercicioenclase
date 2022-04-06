
package ejercicioenclase;
import java.util.Scanner;
public class SerieDos {
    static  Scanner scanner=new Scanner (System.in);
  double hola;
    public SerieDos(){
      
    }
    
    
   
    public  int numero (int numero){
         int arreglo [] = new  int [10];
        int conteoPares = 0, conteoImpares = 0;
          
        
       for (int i=0; i<10; i++){
           System.out.print((i+1)+ "   digite numero");
           arreglo[i]=scanner.nextInt();
         if(arreglo[i] %  2==0){
             conteoPares++;
       
         }
         else 
             conteoImpares ++;
          
         
       }
       int par[]= new int [conteoPares];
       int impar[]=new int [conteoImpares];
       
       conteoPares=0;
       conteoImpares=0;
       
       for (int i=0;i<10;i++){
           if (arreglo[i] % 2==0){
               par [conteoPares]= arreglo[i];
               conteoPares ++;
           }
        else {
               impar[conteoImpares]=arreglo[i];
               conteoImpares ++;
               }

    }
       System.out.println ("pares");
       for (int i=0; i<conteoPares; i++) {
           System.out.println(par[i]+"-  ");
           
       }
       
       System.out.println ("impares");
       for (int i=0; i<conteoImpares; i++) {
           System.out.print(impar[i]+"-   ");
       }
       System.out.println("");
       return 0;
    }

        
  
    
   
  
    @SuppressWarnings("fallthrough")
 public int dia(int dia){
    switch (dia){
        case 1:
             System.out.print("Hoy es domingo, hoy no se trabaja");
            break;
            case 2:
             System.out.print("Hoy es lunes, hoy  se trabaja");
               break;
               case 3:
             System.out.print("Hoy es martes, hoy  se trabaja");
              break;
               case 4:
            System.out.print("Hoy es miercoles, hoy se trabaja");
              break;
               case 5:
             System.out.print("Hoy es jueves, hoy se trabaja");
              break;
               case 6:
             System.out.print("Hoy es viernes, hoy no se trabaja");
              break;
            case 7:
             System.out.print("Hoy es sabado , hoy no se trabaja");
            
            default: System.out.println("salio del menu de dia de la semana");
            
    }
        return dia;
 }
    }

     

    
    

