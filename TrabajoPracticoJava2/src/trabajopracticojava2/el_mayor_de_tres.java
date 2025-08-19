package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 2 Determinar el Mayor de Tres Números.
 * Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
 */
public class el_mayor_de_tres {
    public static void mayor_de_n(int longitud, int[]numeros){
        int max = numeros[0];
        for (int i = 0; i < longitud; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println("El mayor de los tres numeros ingresados es: "+ max);
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] numeros= new int[3];
        int numero;
        int freno = 3;
        int cont = 0;
        while(cont < freno){
            System.out.print("Ingrese un número para comparar: ");
            numero = Integer.parseInt(input.nextLine());
            numeros[cont] = numero;
            cont += 1;
        }
        mayor_de_n(numeros.length, numeros);
    }
}
