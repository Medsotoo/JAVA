import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.swing.ProgressMonitorInputStream;

public class DZ_2 {


    public static void main(String[] args) {
        System.out.println(buldString(10, 'a', 'b'));


//         // Получаем путь к нужному файлу
// Path writeFilePath = Paths.get("/tmp/file.txt");

// // Создаём файл
// Path createdFilePath = Files.createFile(writeFilePath);
// System.out.println("Файл создан: " + createdFilePath);

// // Записываем данные в файл
// String str = "Hello world!";
// // Строку переводим в двоичный тип данных
// byte[] strToBytes = str.getBytes();

// Files.write(createdFilePath, strToBytes);
        // Path of = Paths.get("/JAVA/file.txt"); 
        // Path creat = Files.createFile(of);
        // System.out.println("Файл создан: " + creat);

        // Path of = Path.of("file.txt");
        // Path path = of.toAbsolutePath();
        // Files.createFile("Tesf.txt", null);
        // if (Files.exists(path) == false){
        //     Files.createFile(path);
        // }
    }
    

    // Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    static String buldString(int n, char c1, char c2){ 
        String res = "";
        for(int i = 0; i < n / 2; i++){
            res += c1;
            res += c2;
        }
        return res;
                
    }
    


    //Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз 
    
    // public static void file(String[] args) {
		
	// 	try {
	// 		String str = "Some write file Example";
	// 		byte[] bs = str.getBytes();
	// 		Path writtenFilePath = Files.write(path, bs);
	// 		System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
	// 	} catch (Exception e) {
	// 		e.printStackTrace();
	// 	}
}