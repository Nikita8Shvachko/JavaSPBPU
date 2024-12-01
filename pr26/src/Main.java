interface MyInterface {

    void interfaceMethod();

    // Вложенный статический класс внутри интерфейса
    static class NestedClass {
        public void nestedMethod() {
            System.out.println("Method in the nested class of the interface");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса через интерфейс
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.nestedMethod();
    }
}