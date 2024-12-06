import java.util.Random;
import java.util.Scanner;

public class Adivinaelnumerojeje {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numeroaleatorio = aleatorio.nextInt(100) + 1;
        int numintentos = 10;
        Scanner aleatorio2 = new Scanner(System.in);
        int intento;
        boolean adivina = false;

        System.out.println ("Se genero un numero del 1 al 100, adivinalo en 10 intentos");
        
        for (int myVar_i = 1; i <= numintentos; i++) {
            System.out.println("Intento " + i + ": ");
            intento = aleatorio2.nextInt();

            if (intento == numeroaleatorio) {
                adivina = true;
                System.out.println ("Has adivinado el numero en " + i + " intentos.");
                break;
            } else if (intento < numeroaleatorio) {
                System.out.println ("El numero es mayor");
            } else if (intento > numeroaleatorio) {
                System.out.println ("El numero es menor");
            }

        }

        if (!adivinajeje) {
            System.out.println ("No adivinaste el numero, era: " + numeroaleatorio);
            aleatorio2.close();
        }

    }
}

