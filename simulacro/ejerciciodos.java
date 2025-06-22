import java.util.Scanner;

public class ejerciciodos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int personasDpto, personasPiso, personasTotal;

        personasTotal = 0;
        for (int numPiso = 1; numPiso <=12; numPiso++){
            personasPiso = 0;
            System.out.println("Piso Nº"+numPiso);
            for (int numDpto = 1; numDpto <= 6; numDpto++){
                System.out.println("Ingrese la cantidad de personas en el departamento Nº"+numDpto);
                personasDpto = sc.nextInt();
                personasPiso = personasPiso + personasDpto;
                System.out.println("En el departamento Nº"+numDpto+" hay:"+personasDpto+" persona/s");
            }
            System.out.println("En el piso Nº"+numPiso+" hay: "+personasPiso+" personas");
            personasTotal = personasTotal+personasPiso;
        }
        System.out.println("En el edificio hay un total de:"+personasTotal+" personas");

        sc.close();
    }
}
