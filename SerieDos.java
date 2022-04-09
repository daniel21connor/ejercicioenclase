
package ejercicioenclase;
import java.util.Scanner;
public class SerieDos {
    static  Scanner scanner=new Scanner (System.in);
  double hola;
    public SerieDos(){
      
    }
    
    
   
    public  int numero (int numero){
        int cantidadPar=0, cantidadImpar=0, Promedio, Mayores=0, Termino, Acumulacion=0, sumaPares=0, sumaImpares=0;
         int cantidad1= scanner.nextInt();
         boolean ecuacion = true;
         
         while (ecuacion) {
             for (int i =1; i<cantidad1; i++){
                 System.out.println("Digite numero" +i);
                 int num = scanner.nextInt();
                 
                 if(num%2==0){
                     cantidadPar++;
                     sumaPares= sumaPares+num;
                 }else{
                   cantidadImpar++;                
                   sumaImpares= sumaImpares+num;
                 }
            if(num >=Mayores){
                Mayores = num;
            }
            Acumulacion= sumaImpares+sumaPares;
            
            }
            Promedio= cantidadImpar;
            
              System.out.println("Cantidad de numero pares es :" + cantidadPar);
              System.out.println("Cantidad de numeros impares es :" + cantidadImpar);
              System.out.println("La suma total es de :" + Acumulacion);
              System.out.println("El promedio de los numero impares :" + Promedio);
              System.out.println("0.Salir ");
              Termino = scanner.nextInt(); 
              if (Termino<=0){
              ecuacion = false;
              }else{
              System.out.println(" ");
              }
            }  
        return numero;
  
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

     

    
    

