package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 
 */
public class clasificacion_edad {
   public static void clasificador_edad(int edad){
       if(edad < 0){
           System.out.println("Ingrese una edad valida");
       }else if(edad < 12){
           System.out.println("La edad ingresada corresponde a un niño");
       }else if(edad >= 12 && edad < 17){
           System.out.println("La edad ingresada corresponde a un Adolescente");
       }else if(edad >= 18 && edad <= 59){
           System.out.println("La edad ingresada corresponde a un Adulto");
       }else{
           System.out.println("La edad ingresada corresponde a un Adulto mayor");
       }
   }
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       int edad;
       System.out.print("Ingrese su edad para conocer a que rango etario pertenece: ");
       edad = Integer.parseInt(input.nextLine());
       clasificador_edad(edad);
   }
}
