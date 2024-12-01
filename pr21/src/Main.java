public class Main {
//    Практика #1: Пример использования ключевого слова super

//    class A {
//        int a;
//
//        // Конструктор суперкласса
//        public A(int a) {
//            this.a = a;
//        }
//
//        // Метод суперкласса
//        void method() {
//            System.out.println("Метод суперкласса");
//        }
//    }
//
//    class B extends A {
//        int b;
//
//        // Конструктор подкласса вызывает конструктор суперкласса
//        public B(int a, int b) {
//            super(a);  // Вызов конструктора суперкласса A
//            this.b = b;
//        }
//
//        // Метод подкласса
//        void method() {
//            super.method();  // Вызов метода суперкласса A
//            System.out.println("Метод подкласса");
//        }
//
//        void printFields() {
//            System.out.println("a (из A): " + super.a);  // Доступ к полю суперкласса
//            System.out.println("b (из B): " + this.b);   // Доступ к полю текущего класса
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            B obj = new B(10, 20);
//            obj.method();   // Вызовет метод суперкласса и потом метод подкласса
//            obj.printFields();  // Выведет значения полей из классов A и B
//        }
//    }
//

//    Практика #2: Что произойдёт, если переменная a и метод method() не определены в классе B, но определены в классе A?
//    Если переменная a и метод method() не определены в классе B, но присутствуют в классе A, то при обращении к ним через super в классе C, они будут ссылаться на члены суперкласса (класс A).

//    Практика #3
//
//    Перепешите следующий код с использованием конструкции this(). Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.
//

    class A {
        int a;
        int b;
        int c;
        int z;

        // Конструктор по умолчанию
        public A() {
            this(0, 0, 0);  // Вызов конструктора с тремя параметрами
            z = 1;
        }

        // Конструктор с одним параметром
        public A(int a) {
            this(a, 0, 0);  // Вызов конструктора с двумя параметрами
            z = 1;
        }

        // Конструктор с двумя параметрами
        public A(int a, int b) {
            this(a, b, 0);  // Вызов конструктора с тремя параметрами
            z = 1;
        }

        // Конструктор с тремя параметрами
        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            z = 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}