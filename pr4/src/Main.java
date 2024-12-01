public class Main {
    public static class OperatorsExample {
        public static void main(String[] args) {
            // Оператор = (присваивания)
            int a = 10;
            String s = "Hello";

            // Оператор += (прибавления с присваиванием)
            a += 5; // a = a + 5
            s += " World"; // s = s + " World"

            // Арифметические операторы +, -, *, /, %
            int b = 20;
            int sum = a + b; // сложение
            int diff = b - a; // вычитание
            int product = a * b; // умножение
            int quotient = b / a; // деление
            int remainder = b % a; // остаток от деления

            // Логические операторы ==, !=
            boolean isEqual = a == b;
            boolean isNotEqual = a != b;

            // Сравнительные операторы >, >=, <, <=
            boolean greater = a > b;
            boolean greaterOrEqual = a >= b;
            boolean less = a < b;
            boolean lessOrEqual = a <= b;

            // Побитовые операторы &, |, ^, ~
            int bitwiseAnd = a & b;
            int bitwiseOr = a | b;
            int bitwiseXor = a ^ b;
            int bitwiseNot = ~a;

            // Логические операторы &&, ||
            boolean logicalAnd = (a > 5) && (b > 15);
            boolean logicalOr = (a > 15) || (b > 15);

            // Оператор ? : (тернарный оператор)
            int max = (a > b) ? a : b;

            // Операторы сдвига >>, >>>, <<
            int leftShift = a << 2; // сдвиг влево
            int rightShift = a >> 2; // сдвиг вправо с сохранением знака
            int unsignedRightShift = a >>> 2; // беззнаковый сдвиг вправо

            // Инкремент и декремент (++ и --)
            int c = 5;
            int preIncrement = ++c; // префиксная форма: сначала увеличивается, затем используется
            int postIncrement = c++; // постфиксная форма: сначала используется, затем увеличивается
            int preDecrement = --c; // префиксная форма: сначала уменьшается, затем используется
            int postDecrement = c--; // постфиксная форма: сначала используется, затем уменьшается

            // Оператор instanceof
            String str = "Hello";
            boolean isString = str instanceof String;

            // instanceof и null
            str = null;
            boolean isStringNull = str instanceof String;

            // Вывод результатов
            System.out.println("Сложение: " + sum);
            System.out.println("Префиксный инкремент: " + preIncrement);
            System.out.println("Постфиксный инкремент: " + postIncrement);
            System.out.println("Результат instanceof с null: " + isStringNull);
        }
    }

    public static class InstanceofExample {
        public static void main(String[] args) {
            // Пример 1: Проверка объекта
            String text = "Hello";
            boolean isString = text instanceof String; // true

            // Пример 2: Проверка объекта базового и наследуемого класса
            Object obj = new String("Example");
            boolean isObjectString = obj instanceof String; // true
            boolean isObject = obj instanceof Object; // true

            // Пример 3: Проверка с null
            text = null;
            boolean isNullString = text instanceof String; // false

            // Вывод результатов
            System.out.println("text instanceof String: " + isString);
            System.out.println("obj instanceof String: " + isObjectString);
            System.out.println("text instanceof String (null): " + isNullString);
        }
    }

    public static void main(String[] args) {
        OperatorsExample.main(args);
        InstanceofExample.main(args);
        System.out.println("Hello, World!");
    }
}