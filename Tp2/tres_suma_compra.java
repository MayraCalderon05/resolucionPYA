package resolucionPYA.Tp2;
/* Suma total de una compra 
Crear un algoritmo que solicite el precio de varios productos comprados (por ejemplo, tres
productos) y calcule el total a pagar sumando todos los valores. No se incluyen descuentos
ni impuestos. */

import java.util.Scanner;
public class tres_suma_compra {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //?declaracion de variables
        float producto, total_compra=0;
        String respuesta;
        boolean confirmacion=true;

        //! = es para asignar; == es para comparar
        do {
            System.out.println("Ingrese el precio del producto");
            producto = sc.nextFloat();
            total_compra= total_compra+producto;
            System.out.println("¿Desea ingresar otro producto?(s/n)");
            respuesta = sc.next(); //? esta linea hace que lea la cadena
            if (respuesta.equalsIgnoreCase("n")) { //?equals() compara cadenas y equalsIgnoreCase() omite si son mayusculas o minusculas
                System.out.println("El total a pagar es de: $"+total_compra);
                //confirmacion=false;
                break;
            } 
        } while (confirmacion);
    }
}