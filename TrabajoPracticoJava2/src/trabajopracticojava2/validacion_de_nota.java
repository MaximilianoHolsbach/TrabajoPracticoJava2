package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * Validación de Nota entre 0 y 10 (do-while)
 */
public class validacion_de_nota {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 10;
        int nota;
        do{
            System.out.print("Ingrese una nota para ser guardada: ");
            nota = Integer.parseInt(input.nextLine());
            if(nota < min || nota > max){
               System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10."); 
            }
        }while(nota < min || nota > max);
        System.out.println("Nota guardada correctamente.");
    }
}
