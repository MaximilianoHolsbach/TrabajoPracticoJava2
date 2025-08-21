package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 10. Actualización de stock a partir de venta y recepción de
 * productos.
 */
public class actualizacion_stock {
    public static int actualizar_stock(int stock_actual, int cantidad_vendida, int cantidad_recibida){
        int nuevo_stock = 0;
        nuevo_stock = stock_actual - cantidad_vendida + cantidad_recibida;
        return nuevo_stock;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int stock_actual, cantidad_vendida, cantidad_recibida, nuevo_stock;
        System.out.print("Ingrese el stock actual del producto: ");
        stock_actual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida del producto: ");
        cantidad_vendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida del producto: ");
        cantidad_recibida = Integer.parseInt(input.nextLine());
        nuevo_stock = actualizar_stock(stock_actual, cantidad_vendida, cantidad_recibida);
        System.out.println("El nuevo stock del producto es: "+ nuevo_stock);
    }
}
