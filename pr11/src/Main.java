// Практика #1: Примеры перегрузки (overloading) и переопределения (override) методов

// Базовый класс
class ParentClass {

    // Метод без параметров
    public void display() {
        System.out.println("Метод display() в ParentClass");
    }

    // Перегрузка метода display с одним параметром типа int
    public void display(int value) {
        System.out.println("Перегруженный метод display(int): " + value);
    }

    // Перегрузка метода display с двумя параметрами
    public void display(int value1, String value2) {
        System.out.println("Перегруженный метод display(int, String): " + value1 + ", " + value2);
    }
}

// Подкласс, который переопределяет метод из суперкласса
class ChildClass extends ParentClass {

    // Переопределение метода display() без параметров
    @Override
    public void display() {
        System.out.println("Переопределенный метод display() в ChildClass");
    }

    // Переопределение метода display(int) также возможно
    @Override
    public void display(int value) {
        System.out.println("Переопределенный метод display(int) в ChildClass: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта базового класса
        ParentClass parent = new ParentClass();
        parent.display();                  // Вызов метода display() базового класса
        parent.display(10);                // Вызов перегруженного метода display(int)
        parent.display(20, "Пример");      // Вызов перегруженного метода display(int, String)

        // Создание объекта подкласса
        ChildClass child = new ChildClass();
        child.display();                   // Вызов переопределенного метода display() в ChildClass
        child.display(15);                 // Вызов переопределенного метода display(int) в ChildClass

        // Полиморфный вызов
        ParentClass poly = new ChildClass();
        poly.display();                    // Вызов переопределенного метода display() через ссылку на базовый класс
    }
}