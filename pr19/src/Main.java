public class Main {
    //    class Parent {
//        void method() {
//            System.out.println("Метод суперкласса");
//        }
//    }
//
//    class Child extends Parent {
//        void method() {
//            this.printMessage(); // Вызов метода текущего класса
//            super.method(); // Вызов метода суперкласса
//            System.out.println("Метод подкласса");
//        }
//
//        void printMessage() {
//            System.out.println("Это метод дочернего класса");
//        }
//    }
//    class Parent {
//        void method() {
//            System.out.println("Метод суперкласса");
//        }
//    }
//
//    class Child extends Parent {
//        void method() {
//            super.method(); // Вызов метода суперкласса
//            System.out.println("Метод подкласса");
//        }
//    }
//class A {
//    int a1;          // доступ по умолчанию (package-private)
//    public int a2;   // доступ публичный
//    protected int a3; // защищённый доступ
//    private int a4;   // приватный доступ
//
//    void method1() {
//        // доступ по умолчанию (package-private)
//    }
//
//    public void method2() {
//        // публичный метод
//    }
//
//    protected void method3() {
//        // защищённый метод
//    }
//
//    private void method4() {
//        // приватный метод
//    }
//}
//
//    class B extends A {
//        // Наследуем поля и методы суперкласса A
//        // a1, a2, a3 доступны, но a4 - нет
//        void printValues() {
//            System.out.println(a1); // доступен, т.к. это package-private
//            System.out.println(a2); // доступен, т.к. это public
//            System.out.println(a3); // доступен, т.к. это protected
//            // System.out.println(a4); // ошибка компиляции: private переменная недоступна
//        }
//
//        @Override
//        public void method2() {
//            super.method2(); // доступен, т.к. это public
//        }
//
//        @Override
//        protected void method3() {
//            super.method3(); // доступен, т.к. это protected
//        }
//
//        // private method4() не может быть переопределен, т.к. он недоступен в подклассе.
//    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}