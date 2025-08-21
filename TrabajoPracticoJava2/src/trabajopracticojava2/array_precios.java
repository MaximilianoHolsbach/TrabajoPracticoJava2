package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 12. Modificación de un array de precios y visualización de resultados.
 * 
 */
public class array_precios {
    public static void read_products(double[]products){
        for (int i = 0; i < products.length; i++) {
            System.out.println("id: " + i + " precio: " + products[i]);
        }
    }
    public static void up_date_product(int id, double[]products, double precio_nuevo){
        products[id] = precio_nuevo;
        System.out.println("Precios actualizados: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Precio: "+ products[i]);
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int id_product;
        double precio_nuevo;
        double[] productos = {199.99, 299.5, 149.75, 399.0, 89.99};
        read_products(productos);
        System.out.print("Ingrese el id del producto que necesita actualizar el precio: ");
        id_product = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el id del producto que necesita actualizar el precio: ");
        precio_nuevo = Double.parseDouble(input.nextLine());
        up_date_product(id_product, productos, precio_nuevo);
    }
}
