

interface Flyable {
    void fly();
}

class Bird {
    public void eat() {
        System.out.println("This bird is eating.");
    }
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Penguin extends Bird {
    // Пингвин не реализует интерфейс Flyable, так как он не может летать
    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}
//class Bird {
//    public void fly() {
//        System.out.println("This bird is flying.");
//    }
//}
//
//class Penguin extends Bird {
//    // Пингвины не могут летать, поэтому переопределяем метод
//    @Override
//    public void fly() {
//        throw new UnsupportedOperationException("Penguins can't fly!");
//    }
//}
public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();
        ((Flyable) sparrow).fly();  // Приводим к интерфейсу Flyable, чтобы вызвать fly()

        Bird penguin = new Penguin();
        penguin.eat();
        // Нельзя вызвать fly() у Penguin, так как он не реализует Flyable
    }
}
