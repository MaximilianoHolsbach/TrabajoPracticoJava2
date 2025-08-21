package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 11. Cálculo de descuento especial usando variable global.
 */
public class descuento_especial {
    final static double DESCUENTO = 0.10;
    public static void calcular_descuento_special(double precio){
        double descuento_aplicado, precio_final;
        descuento_aplicado = precio *  DESCUENTO;
        precio_final = precio - (precio *  DESCUENTO);
        System.out.println("El descuento especial aplicado es: "+ descuento_aplicado);
        System.out.println("El precio final con descuento es: "+ precio_final);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double precio;
        System.out.print("Ingrese el precio del producto para aplicar el descuento: ");
        precio = Double.parseDouble(input.nextLine());
        calcular_descuento_special(precio);
    }
}
