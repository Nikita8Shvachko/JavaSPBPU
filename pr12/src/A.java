// Класс с демонстрацией статических методов и полей
public class A {
    public static int a = 1; // Статическое поле (переменная класса)
    public static int b;     // Статическое поле (по умолчанию инициализируется значением 0)

    // Статический метод для вывода значений статических полей
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
