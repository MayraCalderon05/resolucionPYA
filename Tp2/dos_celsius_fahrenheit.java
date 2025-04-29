package resolucionPYA.Tp2;
/* Conversión de temperatura de Celsius a Fahrenheit
Desarrollar un algoritmo que tome como entrada una temperatura en grados Celsius y la convierta a grados Fahrenheit utilizando la fórmula:
Fahrenheit = (Celsius × 9/5) + 32 */

import java.util.Scanner;
public class dos_celsius_fahrenheit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //? declaracion de variables
        float temperatura_celcius, temperatura_fahrenheit;

        //? ingresa la temperatura
        System.out.println("Ingrese la temperatura en grados celcius:");
        temperatura_celcius = sc.nextFloat();

        //* calculo de temperatura en fahrenheits
        temperatura_fahrenheit = ((temperatura_celcius*9/5)+32);

        System.out.println("La temperatura en fahrenheits es de: "+temperatura_fahrenheit+"ºF");
    }
}
