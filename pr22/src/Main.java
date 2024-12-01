//Практика #1
//
//Приведите пример перегруженных методов.
//class Printer {
//    // Перегруженный метод для печати целых чисел
//    void print(int num) {
//        System.out.println("Целое число: " + num);
//    }
//
//    // Перегруженный метод для печати строк
//    void print(String str) {
//        System.out.println("Строка: " + str);
//    }
//
//    // Перегруженный метод для печати массива целых чисел
//    void print(int[] nums) {
//        System.out.print("Массив чисел: ");
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Printer printer = new Printer();
//        printer.print(10);           // Вызов метода с параметром int
//        printer.print("Hello");      // Вызов метода с параметром String
//        printer.print(new int[]{1, 2, 3, 4});  // Вызов метода с параметром int[]
//    }
//}
//Output:
//Целое число: 10
//Строка: Hello
//Массив чисел: 1 2 3 4
//
//Process finished with exit code 0


/// /
/// /Практика #2
/// /
/// /Приведите пример переопределенного метода. Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?
/// /
//class Animal {
//    // Метод, который будет переопределен
//    void speak() {
//        System.out.println("Животное издает звук");
//    }
//}
//
//class Dog extends Animal {
//    // Переопределенный метод
//    @Override
//    void speak() {
//        System.out.println("Собака лает");
//    }
//}
//
//class Cat extends Animal {
//    // Переопределенный метод
//    @Override
//    void speak() {
//        System.out.println("Кошка мяукает");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.speak();  // Собака лает
//        cat.speak();  // Кошка мяукает
//    }
//}
//Output:
//Собака лает
//Кошка мяукает
//
//

////        Практика #3
////
////Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.
//

//class Animal {
//    // Метод, который должен быть переопределен
//    void speak() {
//        System.out.println("Животное издает звук");
//    }
//}
//
//class Dog extends Animal {
//    // Переопределенный метод с правильной аннотацией
//    @Override
//    void speak() {
//        System.out.println("Собака лает");
//    }
//
//    // Ошибка: этот метод не переопределяет метод из суперкласса
//    // @Override
//    // void sound() {  // Ошибка, так как метод sound() нет в суперклассе
//    //     System.out.println("Собака издает звук");
//    // }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.speak();  // Собака лает
//    }
//}
//Output:
//Собака лает