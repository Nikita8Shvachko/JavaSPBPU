public class Main {
    public class Printer {


        // Метод с переменным числом параметров типа Integer (обертка для int)
        public static void printNumbers(Integer... integers) {
            System.out.println("Integers:");
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }

        // Перегрузка метода: метод с переменным числом параметров типа String
        public static void printNumbers(String... strings) {
            System.out.println("Strings:");
            for (String str : strings) {
                System.out.println(str);
            }
        }

        // Перегрузка метода: метод с переменным числом параметров, где параметры разных типов
        public static void printNumbers(Object... objs) {
            System.out.println("Objects:");
            for (Object obj : objs) {
                System.out.println(obj.toString());
            }
        }

    }

    public static void main(String[] args) {
        // Вызовы методов с различными типами аргументов
        Printer.printNumbers(1, 2, 3);  // Использует printNumbers(Integer...)
        Printer.printNumbers("Hello", "World");  // Использует printNumbers(String...)
        Printer.printNumbers(1, "Test", 3.14, true);  // Использует printNumbers(Object...)
    }
        // Output:
        // Integers:
        //     1
        //     2
        //     3
        // Strings:
        //     Hello
        //     World
        // Objects:
        //     1
        //     Test
        //     3.14
        //     true

}