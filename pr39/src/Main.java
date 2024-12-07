import java.io.*;

public class Main {
//    Практика #1
//    Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().

    public class InputStreamExample {
        public static void main(String[] args) {
            try (FileInputStream fis = new FileInputStream("example.txt")) {
                int data;
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data); // Чтение данных и преобразование в символ
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    Практика #2
//    Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).

    public class OutputStreamExample {
        public static void main(String[] args) {
            try (FileOutputStream fos = new FileOutputStream("output.txt")) {
                String data = "Hello, OutputStream!";
                for (char c : data.toCharArray()) {
                    fos.write(c); // Запись символа как байта
                }
                System.out.println("\nData written to file.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //    Практика #3
//    Если есть иерархия байтовых потоков ввода-вывода, основанная на абстрактных классах InputStream и OutputStream,
//    то зачем дополнительные иерархии, основанные на абстрактных классах Reader и Writer?

//InputStream и OutputStream работают с байтами, но часто нужно работать с символами (например, строки текста).
//    Поскольку в Java символы — это 16-битные значения (Unicode), использование байтовых потоков может быть неудобным.
//
//    Классы Reader и Writer:
//            1.	Reader: предоставляет поток ввода символов.
//            2.	Writer: предоставляет поток вывода символов.
//
//    Они облегчают работу с текстом и позволяют учитывать кодировки.

    //    Практика #4
//    Зачем нужен интерфейс AutoCloseable? Приведите пример.
//    Нет необходимости вручную закрывать ресурсы через close().
//    Ресурсы всегда освобождаются корректно, даже если возникает исключение.
    public class AutoCloseableExample {
        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("\nData read from file." +
                        "\nBufferedReader и FileReader закрываются автоматически");
            } catch (IOException e) {
                e.printStackTrace();
            }
            // BufferedReader и FileReader закрываются автоматически
        }
    }

    public static void main(String[] args) {
        InputStreamExample.main(null);
        OutputStreamExample.main(null);
        System.out.println("\nExample of AutoCloseable:");
        AutoCloseableExample.main(null);

//        System.out.println("Hello, World!");
    }
}