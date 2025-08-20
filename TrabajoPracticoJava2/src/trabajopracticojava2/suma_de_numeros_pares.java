package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 5. Suma de Números Pares (while). Escribe un programa que
 * solicite números al usuario y sume solo los números pares. El ciclo debe
 * continuar hasta que el usuario ingrese el número 0, momento en el que se debe
 * mostrar la suma total de los pares ingresados.
 */
public class suma_de_numeros_pares {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numero, freno, acumulado;
        freno = 0;
        acumulado = 0;
        do{
            System.out.print("Ingrese un número entero para sumar: ");
            numero = Integer.parseInt(input.nextLine());
            if(numero % 2 == 0){
                acumulado += numero;
            }
        }while(numero != freno);
        System.out.print("La suma de los números pares es: "+ acumulado);
    }
}
