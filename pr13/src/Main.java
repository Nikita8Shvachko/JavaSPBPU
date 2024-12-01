public class Main {
    // Практика #1: Варианты инициализации константы `final` поля

    // Вариант 1: Инициализация в конструкторе
    public class A {
        public final int a; // Поле `a` должно быть инициализировано до завершения конструктора

        public A(int value) { // Конструктор принимает значение и инициализирует поле `a`
            this.a = value;
        }
    }

    // Вариант 2: Инициализация с помощью блока инициализации
    public class B {
        public final int a; // Поле `a` будет инициализировано в блоке инициализации

        {
            a = 10; // Инициализация поля в блоке
        }
    }

    // Вариант 3: Инициализация в объявлении (в случае если значение доступно заранее)
    public class C {
        public final int a = 20; // Инициализация при объявлении поля
    }

    // Вариант 4: Инициализация в статическом блоке (для статических полей)
    public class D {
        public static final int a; // Статическое финальное поле

        static {
            a = 30; // Инициализация в статическом блоке
        }
    }

    // Вариант 5: Инициализация через конструктор с несколькими вариантами значений
    public class E {
        public final int a;

        public E(boolean condition) {
            if (condition) {
                a = 100; // Инициализация в одном условии
            } else {
                a = 200; // Инициализация в другом условии
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

    }
}