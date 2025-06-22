/*package ejercicios_clase;
 *modularizado pero no es necesario


import java.util.Scanner;

public class deportistas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intensidad, edad;

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        intensidad = CalcularIntensidad(edad);
        
        System.out.println("La intensidad para "+edad+" es de: "+intensidad);
    }

    public static int CalcularIntensidad(int edad){
        int intensidad;

        if (edad<12) {
            intensidad = 10;
        } else {
            if (edad<18) {
                intensidad = 30;
            } else {
                intensidad = 50;
            }
        }
        return intensidad;
    }
}
*/