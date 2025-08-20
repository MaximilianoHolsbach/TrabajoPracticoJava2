package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * Crea un método calcularPrecioFinal(double impuesto, double
 * descuento) que calcule el precio final de un producto en un e-commerce. La
 * fórmula es:
 * 
 * PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
 * PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \timesDescuento)
 * 
 */
public class calculo_impuesto_descuento {
    public static double calculo_impuesto_descuento(double precio_base, double descuento, double impuesto){
        impuesto = 1 + (impuesto/100);
        descuento = descuento/100;
        double precio_final = (precio_base * impuesto) - (precio_base * descuento); 
        return precio_final;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double precio_base, descuento, impuesto, precio_final;
        System.out.print("Ingrese el precio: ");
        precio_base = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento: ");
        descuento = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto: ");
        impuesto = Double.parseDouble(input.nextLine());
        precio_final = calculo_impuesto_descuento(precio_base,descuento,impuesto);
        System.out.println("El precio final es: "+ precio_final + " pesos");
    }
}
