
package ordenamientos;

import java.util.Arrays;

/**
 *
 * @author Davidssd
 */
public class Metodos {
    
    
    public static void bubbleSort(int[] arr){
        
        int swaps = 0;
        int n = arr.length;
        int temp;
        int ciclo = 1;
        
        while (ciclo != 0){
            
            ciclo = 0;
            
            for (int i = 1; i < n-1; i++){
                
                if (arr[i - 1] > arr[i]){

                    temp = arr[ i - 1];                   
                    arr[i - 1] = arr[i];
                    arr[i] = temp; 
                    swaps++;
                    ciclo = i;
                }  
                System.out.println(Arrays.toString(arr));
                
                
            }
            
            
            n--;
            
            
        }
        System.out.println("Numero de swaps: " +swaps);
    }
}
