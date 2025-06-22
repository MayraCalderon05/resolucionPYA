import java.util.Scanner;

public class ejerciciouno {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numProducto;
        double precioKilo, cantidadKilos, subtotal, totalCompra, maxKilos, cantKilosTotales;
        String formaPago, respuesta;
        boolean hayProductos;

        maxKilos = 0;
        totalCompra = 0;
        numProducto=1;
        hayProductos = true;
        cantKilosTotales = 0;
        //! al final reinicio la variable porque al principio se reinicia su valor, entonces la condicion la puse al revés
        do {
            System.out.println("Ingrese el precio por kilo del producto");
            precioKilo = sc.nextDouble();

            System.out.println("Ingrese los kilos del producto");
            cantidadKilos = sc.nextDouble();

            System.out.println("Ingrese la forma de pago");
            formaPago = sc.next();

            subtotal= CalcularSubtotal(precioKilo, cantidadKilos, formaPago);
            System.out.println("Producto Nº"+numProducto);
            System.out.println("Subtotal: $"+subtotal);
            totalCompra = totalCompra + subtotal;
            cantKilosTotales = cantKilosTotales + cantidadKilos;
            
            if (cantidadKilos > maxKilos) {
                maxKilos = cantidadKilos;
            }

            System.out.println("¿Desea ingresar otro producto? (s/n)");
            respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("s")){
                numProducto++;
                hayProductos = false;
            } else {
                hayProductos = true;
            }
        } while (!hayProductos);
        System.out.println("La cantidad de kilos totales es de: "+cantKilosTotales+"kg");
        System.out.println("El total de la compra es de: $"+totalCompra);
        System.out.println("El maximo de kilos de un producto es de: "+maxKilos+"kg");

        sc.close();
    }

    //? para que la funcion de equals funcione bien, necesita usar un tipo de dato string, porques es una funcion de la clase string
    public static double CalcularSubtotal(double preciokilo, double cantidadKilos, String formaPago){
        double subtotal;
        subtotal = preciokilo * cantidadKilos;
        if (cantidadKilos > 3 || formaPago.equalsIgnoreCase("e")) {
            subtotal = subtotal - (subtotal*0.20);
        }
        return subtotal;
    }
}