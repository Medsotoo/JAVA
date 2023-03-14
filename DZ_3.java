import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DZ_3 {
    public static void main(String[] args){
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7, 8, 8, 9, 65, 54));
        System.out.println(integers);
        chet(integers);
        System.out.println(integers);
        
        ArrayList<String> lst = new ArrayList<>(List.of("string", "s", "5", "56", "-12", "654", "my_value"));
        System.out.println(lst);
        cler(lst);
        System.out.println(lst);
        
    }

    // 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа. 
    private static void chet(List<Integer> arr){
        int i = 0;
        while(i < arr.size()){
            if (arr.get(i) % 2 == 1){
                arr.remove(i);
                i++;
            }
            i++;   
        }
    }

    //2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример:
    //ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
    
    private static void cler(List<String> arr1){
        int i = 0;
        while(i < arr1.size()){
            try {
                Integer.parseInt(arr1.get(i));
                arr1.remove(i);  
            } catch (NumberFormatException e) { 
                i++; 
            } 
        }
    }
}
