public class Main {
// Практика #1
// Приведите пример кода с генерацией двух исключений, одно из которых будет "перехвачено", а другое приведет к аварийной остановке.
    static public class ExceptionHandlingExample {
        public static void main(String[] args) {
            try {
                // Генерация первого исключения, которое будет перехвачено
                int result = divide(10, 0);
                System.out.println("Result: " + result);

                // Генерация второго исключения, которое не будет обработано
                String str = null;
                System.out.println("String length: " + str.length());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }

            // Это исключение приведет к аварийной остановке
            String[] fruits = {"Apple", "Banana"};
            System.out.println("Fruit: " + fruits[5]);
        }

        public static int divide(int a, int b) {
            return a / b; // Возможна ArithmeticException
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingExample.main(args);
        System.out.println("Hello, World!");
    }
}