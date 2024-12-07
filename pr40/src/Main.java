import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public class ScannerFileExample {
        public static void main(String[] args) {
            File file = new File("example.txt"); // Указываем путь к файлу
            try (Scanner scanner = new Scanner(file)) { // Создаем Scanner для чтения из файла
                while (scanner.hasNextLine()) { // Проверяем, есть ли следующая строка
                    String line = scanner.nextLine(); // Читаем строку из файла
                    System.out.println(line); // Выводим строку на экран
                }
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        ScannerFileExample.main(args);
    }
}