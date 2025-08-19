package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * Verificación de Año Bisiesto.
 * Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto.
 * Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 * 
 */
public class anio_bisiesto {
    public static void es_bisiesto(int anio){
        if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
            System.out.println("El año ingresado "+ anio + " es bisiesto.");
        }else{
            System.out.println("El año ingresado "+ anio + " no es bisiesto.");
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int anio;
        System.out.print("Ingrese el año para saber si es bisiesto o no: ");
        anio = Integer.parseInt(input.nextLine());
        es_bisiesto(anio);
    }
}
