package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 13. Impresión recursiva de arrays antes y después de modificar un elemento.
 */
public class impresion_recursiva {
    public static void impresion_recursiva(double[]array, int indice){
        if(indice < array.length){
            System.out.println(array[indice]);
            impresion_recursiva(array, indice + 1);
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int indice;
        double precio_nuevo;
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        impresion_recursiva(precios, 0);
        System.out.print("Ingrese el indice para actualizar el precio: ");
        indice = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el precio nuevo para actualizar el producto: ");
        precio_nuevo = Double.parseDouble(input.nextLine());
        precios[indice] = precio_nuevo;
        System.out.print("Precios actualizados: ");
        impresion_recursiva(precios, 0);
    }
}
