
package ordenamientos;

import java.util.Arrays;

public class Metodos {
    
	static int swaps = 0;
	
	
	public static void swap(Integer[] arr, int i, int j){
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    	swaps++;
    	System.out.println(Arrays.toString(arr));
    }
	
	
    //David
    public static void bubbleSort(Integer[] arr){                
        int n = arr.length;
        int ciclo = 1;
        
        while (ciclo != 0){            
            ciclo = 0;            
            for (int i = 1; i < n; i++){                
                if (arr[i - 1] > arr[i]){ 
                	swap(arr, i-1, i);
                	ciclo = i;                  
                }                                                
            }
            n--;                        
        }
        System.out.println("Numero de swaps: " +swaps);
    }
    ////End David
    
    
    //Luis Antonio
    public static Integer[] selectionSort(Integer [] arr){
	       int i,x,indice;
	       for (i=0;i<arr.length-1;i++){
	           indice = i;
	           for(x=i; x<arr.length;x++){
	               if(arr[x]<arr[indice]){
	                   indice = x;
	               }
	               if (indice != i){
	            	   swap(arr, i, indice);
	               }
	           }
	       }
	       System.out.println("Numero de swaps: " +swaps);
	       return arr;
	 }
    ////End Luis Antonio
    
    
    //Monica
    public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
		System.out.println("Numero de swaps: " +swaps);
	}
	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd){
            if(a[left].compareTo(a[right]) <= 0){
                tmp[k++] = a[left++];
            	swaps++;
            }
            else{
                tmp[k++] = a[right++];
                swaps++;
            }
        }
        while(left <= leftEnd){
            tmp[k++] = a[left++];
            swaps++;
        }
        while(right <= rightEnd){
            tmp[k++] = a[right++];
            swaps++;
        }
        for(int i = 0; i < num; i++, rightEnd--){
            a[rightEnd] = tmp[rightEnd];
            swaps++;
        }
    }
    ////End Monica
    
    
    //Sara
    public static void qSort(Integer[] arr, int izq, int der){
    	int i = izq;
    	int j = der;
    	Integer piv = arr[izq + (der - izq)/2];
    	
    	while (i <= j){
    		while (arr[i] < piv){
    			i++;
    		}
    		while (arr[j] > piv){
    			j--;
    		}
    		if (i <= j){
    			swap(arr, i, j);
    			i++;
    			j--;
    		}
    	}
    	if (izq < j){
    		qSort(arr, izq, j);
    	}
    	if (i < der){
    		qSort(arr, i, der);
    	}
    	
    }
    public static void quickSort(Integer[] arr){
    	int last = arr.length - 1;
    	qSort(arr, 0, last);
    	System.out.println("Numero de swaps: " +swaps);
    }
    ////End Sara
    
    
    //Jose Antonio
	private static int size;
	private static int left;
	private static int right;
	private static int largest;
    
    public static void buildheap(Integer[] a){ 
		size = a.length-1; 
		for(int i = size/2;i >= 0;i--){ 
			maxheap(a,i); 
		} 
	} 

	public static void maxheap(Integer[] a, int i){ 
		left = 2*i; 
		right = (2*i)+1; 
		if(left <= size && a[left] > a[i]){ 
			largest=left; 
		} 
		else{ 
			largest=i; 
		} 

		if(right <= size && a[right] > a[largest]){ 
			largest=right; 
		} 
		if(largest!=i){ 
			swap(a, i,largest); 
			maxheap(a,largest); 
		} 
	}
	public static void heapSort(Integer[] a){
		buildheap(a);
		for(int i = size; i > 0; i--){
			swap(a, 0, i);
			size = size-1;
			maxheap(a, 0);
		}
		System.out.println("Numero de swaps: " +swaps);
	}
    ////End Jose Antonio
}

