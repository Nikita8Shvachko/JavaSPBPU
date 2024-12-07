public class Main {

    //    Практика #1
//
//    Что произойдет при выполнении данного кода? Поясните.
//
    public class App {
        final static int START_COUNTER;

        static {
            START_COUNTER = Integer.parseInt("Y-");
        }

        public static void main(String[] args) {
            System.out.println("Hello");
        }
    }
//При выполнении программы произойдет ошибка на этапе инициализации класса,
//    и main метод никогда не будет выполнен. Причина заключается в том, что в статическом блоке
//        (static { ... }) происходит попытка преобразования строки "Y-" в целое число с помощью метода
//        Integer.parseInt.
//
//    Метод Integer.parseInt(String) выбрасывает исключение NumberFormatException,
//    если строка не является корректным представлением целого числа. Строка "Y-" некорректна,
//    так как содержит недопустимые символы.
//        	1.	При запуске программы JVM начинает загрузку класса App и его инициализацию.
//	        2.	На этапе инициализации выполняется статический блок:
//          3.	Метод Integer.parseInt("Y-") выбрасывает исключение NumberFormatException.
//          4.	Исключение приводит к аварийному завершению программы, так как исключение в статическом блоке является фатальной ошибкой.
//          5.	Метод main не будет вызван, и строка "Hello" никогда не выведется.
//Output:    Exception in thread "main" java.lang.ExceptionInInitializerError
//    at Main.main(Main.java:40)
//    Caused by: java.lang.NumberFormatException: For input string: "Y-"
//    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//    at java.base/java.lang.Integer.parseInt(Integer.java:668)
//    at java.base/java.lang.Integer.parseInt(Integer.java:786)
//    at Main$App.<clinit>(Main.java:32)
//            ... 1 more

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        App.main(args);
    }
}