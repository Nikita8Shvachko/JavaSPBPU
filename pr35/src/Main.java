public class Main {
    //    Практика #1
//
//            1. Обработка нескольких исключений одинаковым образом
    static public class MultipleExceptionsExample {
        public static void main(String[] args) {
            try {
                // Генерация исключений
                if (Math.random() > 0.5) {
                    throw new ArithmeticException("ArithmeticException occurred");
                } else {
                    throw new NullPointerException("NullPointerException occurred");
                }
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

    //2. Обработка исключений с иерархией Ex1 <|-- Ex2 <|-- Ex3
    class Ex1 extends Exception {
    }

    class Ex2 extends Ex1 {
    }

    class Ex3 extends Ex2 {
    }

    public class ExceptionHierarchyExample {
        public void main(String[] args) {
            try {
                throw new Ex3(); // Генерация исключения нижнего уровня
            } catch (Ex3 e) {
                System.out.println("Caught Ex3");
            } catch (Ex2 e) {
                System.out.println("Caught Ex2");
            } catch (Ex1 e) {
                System.out.println("Caught Ex1");
            }
        }
    }

    //    Практика #2
//
//    Использование final в блоке catch
//    Использование final в объявлении параметра исключения (e) означает,
//    что переменной e нельзя присвоить другое значение в теле catch например, следующий код вызовет ошибку компиляции:

//    catch (final Exception e) {
//        e = new Exception("Another exception"); // Ошибка компиляции
//    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}