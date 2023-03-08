import java.util.Arrays;

public class practicum {
    public static void main(String[] args){
        int[] array = {3, 5, 5, 6, 7, 8, 97, 5}; 
        int val = 5;
        swap(array, val);
        System.out.println(Arrays.toString(array));
        
        
    }

    static void swap(int[] array, int val){
        int shift = 1;
        for (int i = 0; i < array.length / 2; i++){
            if (array[i] == val){
                int tmp = array[i];
                array[i] = array[array.length - shift];
                array[array.length - shift] = tmp;
                shift++;
            }
        }

    }
    
}
