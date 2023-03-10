import java.util.Arrays;

public class DZ_2 {


    public static void main(String[] args) {
        int n = 10;
        int c1 = 3;
        int c2 = 2;
        res(n, c1, c2);
    }
    

    // Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    private static void res(int n, int c1, int c2){ 
        int[] arr = new int[n];
        for(int i = 0; i < n / 2; i++){
            arr[i + i] = c1;
            arr[i * 2 + 1] = c2;
        }
        System.out.println(Arrays.toString(arr));

    }


    //Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз

    


   
}
