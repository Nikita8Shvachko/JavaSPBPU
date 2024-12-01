//Практика #1
//
//Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.
/*

public class OuterClass {
    private int privateField = 10;
    public int publicField = 20;
    protected int protectedField = 30;
    int defaultField = 40;

    // Внутренний класс с разными спецификаторами доступа
    public class PublicInnerClass {
        void display() {
            System.out.println("Public Inner Class can access: " + privateField);
        }
    }

    class DefaultInnerClass {
        void display() {
            System.out.println("Default Inner Class can access: " + privateField);
        }
    }

    private class PrivateInnerClass {
        void display() {
            System.out.println("Private Inner Class can access: " + privateField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Доступ к публичному внутреннему классу
        OuterClass.PublicInnerClass publicInner = outer.new PublicInnerClass();
        publicInner.display();

        // Доступ к внутреннему классу с дефолтным доступом
        OuterClass.DefaultInnerClass defaultInner = outer.new DefaultInnerClass();
        defaultInner.display();

        // Попытка доступа к приватному внутреннему классу (ошибка компиляции)
        // OuterClass.PrivateInnerClass privateInner = outer.new PrivateInnerClass(); // Error!
    }
}
*/

//Практика #2
//
//Имеет ли внутренний класс доступ к полям и методам внешнего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.
//
/*
public class OuterClass {
    private String privateField = "Private Field";
    public String publicField = "Public Field";

    public class InnerClass {
        void accessOuterClassFields() {
            // Внутренний класс может обращаться к private и public полям внешнего класса
            System.out.println("Accessing private field: " + privateField);
            System.out.println("Accessing public field: " + publicField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterClassFields();
    }
}*/

//Практика #3
//
//Имеет ли внешний класс доступ к полям и методам внутреннего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.
/*

public class OuterClass {
    private String privateField = "Private Field";

    public class InnerClass {
        private String innerField = "Inner Field";

        public void innerMethod() {
            System.out.println("Inner method");
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        System.out.println("Accessing inner field: " + inner.innerField);
        inner.innerMethod();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();
    }
}*/
