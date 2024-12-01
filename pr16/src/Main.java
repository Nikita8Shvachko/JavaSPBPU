import java.util.ArrayList;
import java.util.List;
//class Wrapper<T> {
//    private T item;
//
//    public Wrapper(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return item;
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
//        Wrapper<Integer> intWrapper = new Wrapper<>(123);
//
//        // Проверка типа объекта
//        if (stringWrapper instanceof Wrapper) { // Допустимо
//            System.out.println("stringWrapper является объектом Wrapper");
//        }
//
//        if (intWrapper instanceof Wrapper<?>) { // Проверка с wildcard
//            System.out.println("intWrapper является объектом Wrapper");
//        }
//
//        // Попытка проверки параметризованного типа (недопустимо)
//        // if (stringWrapper instanceof Wrapper<String>) { } // Ошибка компиляции
//    }

/// /    result:
/// /      stringWrapper является объектом Wrapper
/// /      intWrapper является объектом Wrapper
//
//}


//public class Main {
//    public static void printList(List<? extends Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//
//        printList(intList); // List<Integer> передается как List<? extends Number>
//
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(1.1);
//        doubleList.add(2.2);
//
//        printList(doubleList); // List<Double> передается как List<? extends Number>
////        result:
//        //1
//        //2
//        //3
//        //1.1
//        //2.2
//    }
//
//}

public class Main {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList); // List<Number> передается как List<? super Integer>

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList); // List<Object> передается как List<? super Integer>

        System.out.println(numberList);
        System.out.println(objectList);
//        result:
            //[1, 2, 3]
            //[1, 2, 3]

    }
}