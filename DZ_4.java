import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> myList = new LinkedList<>();
        while (true) { 
            String s = sc.nextLine();
            if (s.equals("exit")) { 
                break;
            } else {
                String[] split = s.split("~");
                System.out.println(Arrays.toString(split));
                int myIndex = Integer.parseInt(split[1]);
                String theWord = split[0];
                int size = 0;
                if (size < myIndex) {
                    size = myIndex;
                }
                while (myList.size() <= size) {
                    myList.add(null);
                }
                if (theWord.equals("print")) { 
                    System.out.println(myList.get(myIndex));
                } else {
                    myList.set(myIndex, theWord);
                    System.out.println(myList);
                }   
            }
        }
    }
}

