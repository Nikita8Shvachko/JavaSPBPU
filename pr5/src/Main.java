public class Main {
    public static class DecodeExample {
        public static void main(String[] args) {
            Integer decimal = Integer.decode("123");   // Десятичное число
            Integer octal = Integer.decode("0123");    // Восьмеричное число
            Integer hex1 = Integer.decode("0x123");    // Шестнадцатеричное число
            Integer hex2 = Integer.decode("#123");     // Шестнадцатеричное число

            System.out.println("Decimal: " + decimal); // 123
            System.out.println("Octal: " + octal);     // 83 (0123 -> восьмеричная система)
            System.out.println("Hex (0x123): " + hex1); // 291
            System.out.println("Hex (#123): " + hex2);  // 291
        }
    }

    public static class BooleanExample {
        public static void main(String[] args) {
            // Способы создания экземпляра класса Boolean
            Boolean bool1 = Boolean.valueOf(true);    // Использование базового типа
            Boolean bool2 = Boolean.valueOf("true");  // Использование строки
            Boolean bool3 = Boolean.valueOf("false"); // Использование строки

            // Автоупаковка (boxing)
            Boolean bool4 = true;

            // Вывод результатов
            System.out.println("bool1: " + bool1); // true
            System.out.println("bool2: " + bool2); // true
            System.out.println("bool3: " + bool3); // false
            System.out.println("bool4: " + bool4); // true
        }
    }

    public static class UnboxingExample {
        public static void main(String[] args) {
            Integer value = null; // Объект-оболочка равен null
            try {
                int unboxedValue = value; // Автораспаковка -> NullPointerException
            } catch (NullPointerException e) {
                System.out.println("NullPointerException при автораспаковке");
            }
        }
    }

    public static class IntegerCacheExample {
        public static void main(String[] args) {
            int i1 = 128;
            Integer a1 = i1;
            Integer b1 = i1;

            System.out.println("a1 == i1 " + (a1 == i1));        // true
            System.out.println("b1 == i1 " + (b1 == i1));        // true
            System.out.println("a1 == b1 " + (a1 == b1));        // false
            System.out.println("a1.equals(i1) -> " + a1.equals(i1));  // true
            System.out.println("b1.equals(i1) -> " + b1.equals(i1));  // true
            System.out.println("a1.equals(b1) -> " + a1.equals(b1));  // true

            int i2 = 127;
            Integer a2 = i2;
            Integer b2 = i2;

            System.out.println("a2 == i2 " + (a2 == i2));        // true
            System.out.println("b2 == i2 " + (b2 == i2));        // true
            System.out.println("a2 == b2 " + (a2 == b2));        // true
            System.out.println("a2.equals(i2) -> " + a2.equals(i2));  // true
            System.out.println("b2.equals(i2) -> " + b2.equals(i2));  // true
            System.out.println("a2.equals(b2) -> " + a2.equals(b2));  // true
        }
    }

    public static void main(String[] args) {
        DecodeExample.main(args);
        System.out.println();
        BooleanExample.main(args);
        System.out.println();
        UnboxingExample.main(args);
        System.out.println();
        IntegerCacheExample.main(args);


        System.out.println("Hello, World!");
    }
}