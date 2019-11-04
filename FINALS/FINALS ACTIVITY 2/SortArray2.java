
package sortarray2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SortArray2 {

    static int array[];
  
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arraySize;
        
        System.out.println("Enter size of array: ");
        arraySize = Integer.parseInt(br.readLine());
        array = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
           System.out.println("Enter value " + (i+1));
           array[i] = Integer.parseInt(br.readLine());
           
        }
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        
            sort(arraySize);
        
        System.out.println("Sorted Array: " + Arrays.toString(array));
        mean(arraySize);
        
    }
    
    public static void sort(int arraySize){
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (array[i] < array[j]) {
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        
    }
    
    public static void mean(int arraySize){
        double sum = 0;
        double average = 0;
        DecimalFormat df = new DecimalFormat("#.#");
        for (int i = 0; i < arraySize; i++) {
            sum = array[i] + sum;
            average = sum / arraySize;
        }
        System.out.println("Mean: " + df.format((double)average));
        
    }
    
}

