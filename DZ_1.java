import java.net.SocketPermission;
import java.time.Year;
import java.util.Arrays;

public class DZ_1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println(isLeapYear(2024));

        System.out.println(Arrays.toString(createArray(10, 6)));
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[] arr = {0, 1, 0, 1, 0, 0, 0};

        newArr(arr);

        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        arr1_x2(arr1);

        int[][] arr2 = new int[5][5];

        twoDimensional(arr2);


    
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3]; 
    
    
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int c = a + b;
        return ((c <= 20) && (c >= 10));

    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String res = "";
        for(int i = 0; i < repeat; i++){
            res += source;
        }
        System.out.println(res);
            
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        return ((year % 4 == 0) | ((year % 100 == 0) & (year % 400 == 0)));
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initalValue;
        }
        return (array);
    }
    
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */

    // 1
     private static void newArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //2

     private static void arr1_x2(int[] arr1){
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] < 6){
                arr1[i] = arr1[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr1));
     }
     //3

     private static void twoDimensional(int[][] arr2){
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                if (i == j){
                    arr2[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr2[i]));

        }
        
     }
    
    
    }