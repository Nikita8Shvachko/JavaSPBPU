public class Main {
    // Собственное исключение
    static class MyFirstException extends Exception {
        // Конструктор без параметров
        public MyFirstException() {
            super("MyFirstException occurred");
        }

        // Конструктор с сообщением
        public MyFirstException(String message) {
            super(message);
        }

        // Конструктор с сообщением и причиной
        public MyFirstException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    // Пример использования
    public static class CustomExceptionExample {
        public void main(String[] args) {
            try {
                throwCustomException();
            } catch (MyFirstException e) {
                System.out.println("Caught exception: " + e.getMessage() + ", cause: " + e.getCause().getMessage());
            }
        }

        // Метод, генерирующий исключение
        public void throwCustomException() throws MyFirstException {
            throw new MyFirstException("This is a custom exception!", new Exception("Inner exception"));
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        CustomExceptionExample example = new CustomExceptionExample();
        example.main(args);

    }

}