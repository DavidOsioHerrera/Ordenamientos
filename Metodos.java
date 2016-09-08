
package ordenamientos;

/**
 *
 * @author Davidssd
 */
public class Bubblesort {
    
    
    public static void sort(int[] arr){
        
        int n = arr.length;
        int temp;
        int ciclo = 1;
        
        while (ciclo != 0){
            
            ciclo = 0;
            
            for (int i = 1; i < n; i++){
                
                if (arr[i - 1] > arr[i]){

                    temp = arr[ i - 1];                   
                    arr[i - 1] = arr[i];
                    arr[i] = temp; 
 
                    ciclo = i;
                }    
            }
            
            n--;
        }
    }
}
