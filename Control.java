
package ordenamientos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 	David Osio Herrera
 * 			Sara Ferananda Ahuactzin
 * 			Luis Antonio Vasquez
 * 			
 * 
 */
public class Control {

    private static Scanner in;

	public static void main(String[] args) {
        
        Random r = new Random();
        in = new Scanner(System.in);
        
        System.out.println("Tamaño del arreglo:");
        int rango = in.nextInt();
        
        Integer arregloR[] = new Integer[rango];
        for (int i = 0; i < rango; i++){
            arregloR[i] = r.nextInt(rango);
        }
        
        Integer arregloA[] = new Integer[rango];
        for (int i = 0; i < rango; i++){
        	arregloA[i] = i;
        }
        
        Integer arregloD[] = new Integer[rango];
        for (int i = 1; i <= rango; i++){
        	arregloD[rango - i] = i;
        }
        
        Integer arregloM[] = new Integer [rango];
        for (int i = 0; i < rango; i++){
        	arregloM[i] = 1;
        }
        
        //Elegir tipo de arreglo
        Integer[] arr = arregloR;
        
        
        System.out.println("Arreglo inicial: " +Arrays.toString(arr) +"\n");
         //Para cambiar de metodo hay que cambiar la palabra antes de Sort
        // Metodos.*****Sort(arr)
        Metodos.heapSort(arr);
        
        System.out.println("\n Arreglo ordenado: " +Arrays.toString(arr));
    }
    
}
