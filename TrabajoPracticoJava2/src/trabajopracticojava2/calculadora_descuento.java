package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 */
public class calculadora_descuento {
    final static double categoria_a = 0.10;
    final static double categoria_b = 0.15;
    final static double categoria_c = 0.20;
    public static void descuentos_x_categoria(char categoria, double precio){
        if(precio > 0){
            switch(categoria){
                case'a':
                case'A':
                    System.out.println("El precio final con el descuento: " + (categoria_a * 100)+"%" + " es: " + (precio - (precio * categoria_a)) + " pesos.");
                    break;
                case'b':
                case'B':
                    System.out.println("El precio final con el descuento: " + (categoria_b * 100)+"%" + " es: " + (precio - (precio * categoria_b)) + " pesos.");
                    break;
                case'c':
                case'C':
                    System.out.println("El precio final con el descuento: " + (categoria_c * 100)+"%" + " es: " + (precio - (precio * categoria_c)) + " pesos.");
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }else{
            System.out.println("El precio no puede ser igual o menor a cero.");
        }
    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double precio;
        char categoria;
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del descuento a, b, o c: ");
        categoria = input.nextLine().charAt(0);
        descuentos_x_categoria(categoria, precio);
    }
}
