
import java.util.Arrays;

public class AlgunArreglo {
    public static void main(String[] args) {
        int[] arreglo = { 4, 8, 5, 1};
        System.out.println(Arrays.toString(arreglo));
        int myVar_temp;
        for(int myVar_i = 0 ; i < arreglo.length - 1 ; i++)
        {
            for(int myVar_j = i + 1 ; j < arreglo.length ; j++)
            {
        System.out.printl("Valores i:" + i + " j: " + j);
                if( arreglo[i] > arreglo[j])
                {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println("Fin");
    }
}