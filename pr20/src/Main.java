public class Main {
//    Практика #1: Невозможность переопределить final-метод

//    class Parent {
//        // Метод объявлен как final, его нельзя переопределить
//        public final void method() {
//            System.out.println("Метод суперкласса");
//        }
//    }
//
//    class Child extends Parent {
//        // Попытка переопределить final-метод вызовет ошибку компиляции
//        // public void method() { // Ошибка! Невозможно переопределить final-метод.
//        //     System.out.println("Метод подкласса");
//        // }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Parent parent = new Parent();
//            parent.method();  // Выведет: "Метод суперкласса"
//
//            Child child = new Child();
//            child.method();  // Это вызовет метод родительского класса, т.к. его нельзя переопределить
//        }
//    }
/// /// /// /// /// /// /// /
//    Практика #2: Невозможность наследования от final-класса
//    final class FinalClass {
//    void display() {
//        System.out.println("Это финальный класс!");
//    }
//}
//

    /// / Попытка наследовать от final класса приведет к ошибке
    /// / class SubClass extends FinalClass {  // Ошибка! Невозможно наследовать от final класса.
    /// /     void display() {
    /// /         System.out.println("Это подкласс.");
    /// /     }
    /// / }
//
//public class Main {
//    public static void main(String[] args) {
//        FinalClass obj = new FinalClass();
//        obj.display();  // Выведет: "Это финальный класс!"
//    }
//}
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}