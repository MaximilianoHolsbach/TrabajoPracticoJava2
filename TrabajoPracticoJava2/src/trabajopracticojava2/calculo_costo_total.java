package trabajopracticojava2;
import java.util.Scanner;
/**
 *
 * @author Maxi
 * 
 * 9. Composición de funciones para calcular costo de envío y total de compra.
 */
public class calculo_costo_total {
    final static double NACIONAL = 5;
    final static double INTERNACIONAL = 10;
    
    public static double calcular_costo_envio(double peso, String zona){
        double costo_envio = 0;
        switch(zona.toUpperCase()){
            case "NACIONAL":
                costo_envio = NACIONAL * peso;
                break;
            case "INTERNACIONAL":
                costo_envio = INTERNACIONAL * peso;
                break;
            default:
                System.out.println("Ingrese un destino valido ");
        }
        return costo_envio;
    }
    public static double calcular_total_copmpra(double precio_producto, double costo_envio){
        return precio_producto + costo_envio;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String zona;
        double precio, peso, total_a_pagar, costo_envio;
        System.out.print("Ingrese el costo del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del producto: ");
        peso = Double.parseDouble(input.nextLine());
        do{
            System.out.print("Ingrese la zona a la que desea enviar el producto: ");
            zona = (input.nextLine()).toUpperCase();
        }while(!(zona.equalsIgnoreCase("NACIONAL") || zona.equalsIgnoreCase("INTERNACIONAL")));
        costo_envio = calcular_costo_envio(peso, zona);
        total_a_pagar = calcular_total_copmpra(precio, costo_envio);
        System.out.println("El costo del envio para el destino: "+ zona +" es: "+ costo_envio +" pesos."+"\nEl total a pagar es: "+ total_a_pagar+" pesos.");
    }
}
