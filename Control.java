
package ordenamientos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Davidssd
 */
public class Control {

    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Tamaño del arreglo:");
        int rango = in.nextInt();
        
        int arreglo[] = new int[rango];
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = r.nextInt(rango);
        }
        
        System.out.println("Arreglo inicial: " +Arrays.toString(arreglo));
        
        Bubblesort.sort(arreglo);
        
        System.out.println("Arreglo ordenado: " +Arrays.toString(arreglo));
    }
    
}
