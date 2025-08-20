package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 6. Contador de Positivos, Negativos y Ceros
 */
public class contador_tipo_numeros {
    final static int freno = 10;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int contador = 0;
        int numero; 
        int positivo = 0; 
        int negativo = 0; 
        int cero = 0;
        while(contador < freno){
            System.out.print("Ingrese un número para poder clasificarlo: ");
            numero = Integer.parseInt(input.nextLine());
            if(numero < 0){
                negativo += 1;
            }else if(numero > 0){
                positivo += 1; 
            }else{
                cero += 1; 
            }
            contador += 1;
        }
        System.out.println("Los números clasificados son:\nNegativos: "+ negativo +"\nPositivos: "+ positivo +"\nCeros: "+ cero);
    }
}
