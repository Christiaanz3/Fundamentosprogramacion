import java.util.Scanner;

public class Numerosde1al00 {
        public static void main(String[] args) {
        Scanner hola = new Scanner(System.in);
        
        System.out.print("Introduce un número menor a 100: ");
        int numero = hola.nextInt();
        
        if (numero < 100) {
            int suma = 0;
            
            for (int i = 1; i <= numero; i++) {
                suma += i;
            }
            
            int dobleSuma = 2 * suma;
            System.out.println("El doble de la suma de los números entre 1 y " + numero + " es: " + dobleSuma);
        } else {
            System.out.println("El número debe ser menor a 100.");
        }
        
        hola.close();
    }
}
