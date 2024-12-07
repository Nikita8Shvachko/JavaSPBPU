public class Main {
//  Практика #1: Назначение основных классов исключений
//	1. Throwable
//	    • Базовый класс для всех ошибок и исключений.
//  	• Предоставляет общие методы для работы с исключениями, такие как getMessage(), printStackTrace().
//  2. Error
//	    • Используется для критических ошибок, которые обычно нельзя обработать.
//	    • Примеры: OutOfMemoryError, StackOverflowError.
//	    • Эти ошибки указывают на сбои в среде выполнения или JVM.
//  3. Exception
//	    • Базовый класс для всех исключений, которые могут быть обработаны.
//          • Делится на два типа:
//          • Проверяемые исключения (Checked Exceptions): необходимо явно обрабатывать или объявлять в методе с throws. Пример: IOException, SQLException.
//	    • Непроверяемые исключения (Unchecked Exceptions): наследуются от RuntimeException. Пример: NullPointerException, ArithmeticException.
//	4. RuntimeException
//	    • Используется для исключений, которые возникают в ходе выполнения программы из-за ошибок в логике или данных.
//      • Обработка этих исключений не обязательна.


    //    Практика #2  Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.
//ArithmeticException
    static public class ArithmeticExceptionExample {
        public static void main(String[] args) {
            try {
                int result = 10 / 0; // Деление на ноль
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
        }
    }

    //ArrayIndexOutOfBoundsException
    static public class ArrayIndexOutOfBoundsExceptionExample {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                int num = numbers[5]; // Несуществующий индекс
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        }
    }

    //IllegalArgumentException
    static public class IllegalArgumentExceptionExample {
        public static void main(String[] args) {
            try {
                printAge(-5); // Недопустимый возраст
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());
            }
        }

        public static void printAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        }
    }

    //ClassCastException
    static public class ClassCastExceptionExample {
        public static void main(String[] args) {
            try {
                Object obj = "Hello";
                Integer num = (Integer) obj; // Приведение строки к числу
            } catch (ClassCastException e) {
                System.out.println("ClassCastException caught: " + e.getMessage());
            }
        }
    }

    //NullPointerException
    static public class NullPointerExceptionExample {
        public static void main(String[] args) {
            try {
                String str = null;
                System.out.println(str.length()); // Попытка вызвать метод через null
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        System.out.println("Arithmetic Exception");
        ArithmeticExceptionExample.main(args);
        System.out.print("\n");

        System.out.println("ArrayIndexOutOfBoundsException");
        ArrayIndexOutOfBoundsExceptionExample.main(args);
        System.out.print("\n");

        System.out.println("IllegalArgumentException");
        IllegalArgumentExceptionExample.main(args);
        System.out.print("\n");

        System.out.println("ClassCastException");
        ClassCastExceptionExample.main(args);
        System.out.print("\n");


        System.out.println("NullPointerException");
        NullPointerExceptionExample.main(args);
    }
}