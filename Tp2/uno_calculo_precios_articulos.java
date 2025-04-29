package resolucionPYA.Tp2;
/*Diseñar un algoritmo que reciba como entrada el precio base de un producto, 
el porcentaje de descuento y el porcentaje de IVA (impuesto al valor agregado), 
y calcule el precio final a pagar luego de aplicar primero el descuento y luego el impuesto. */

import java.util.Scanner;

public class uno_calculo_precios_articulos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //? declaracion de variables
    float precio_articulo, precio_descuento, precio_conIVA, precio_final;
    int aplicar_descuento;
    int iva = 21;

    //? ingresan los datos inrgesables como lo son el precio y el descuentoa aplicar
    System.out.println("Ingrese el precio del artículo:");
    precio_articulo = sc.nextFloat();

    System.out.println("Ingrese el descuento que quiere aplicar:");
    aplicar_descuento = sc.nextInt();

    //* calculo de variables
    precio_descuento = (precio_articulo - (precio_articulo*aplicar_descuento/100));
    precio_conIVA = (precio_descuento + (precio_descuento*iva/100));
    precio_final = precio_conIVA;

    System.out.println("El precio con el descuento es de: $"+precio_descuento);
    System.out.println("El precio con el IVA es de $"+precio_conIVA);
    System.out.println("El precio final del artículo es de: $"+precio_final);

    }
}
