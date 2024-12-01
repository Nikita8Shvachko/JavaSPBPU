public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        {
            int value = 1;
            switch (value) {
                case 1:
                    System.out.println("Value is 1");
                    break;
                case 2:
                    System.out.println("Value is 2");
                    break;
                default:
                    System.out.println("Value is not 1 or 2");
                    break;
            }
        }

        {
            char value = 'A';
            switch (value) {
                case 'B':
                    System.out.println("Value is B");
                    break;
                case 'A':
                    System.out.println("Value is A");
                    break;
                default:
                    System.out.println("Value is not A or B");
                    break;
            }
        }

        {
            enum Day {MONDAY, TUESDAY, WEDNESDAY}
            Day today = Day.MONDAY;
            switch (today) {
                case TUESDAY:
                    System.out.println("Today is Tuesday");
                    break;
                case MONDAY:
                    System.out.println("Today is Monday");
                    break;
                default:
                    System.out.println("Today is not Monday or Tuesday");
                    break;
            }
        }

        {
            String value = "Hello";
            switch (value) {
                case "World":
                    System.out.println("Value is World");
                    break;
                case "Hello":
                    System.out.println("Value is Hello");
                    break;
                default:
                    System.out.println("Value is not Hello or World");
                    break;
            }
        }
        {
            Integer value = 1;
            switch (value) {
                case 2:
                    System.out.println("Value is 2");
                    break;
                case 1:
                    System.out.println("Value is 1");
                    break;
                default:
                    System.out.println("Value is not 1 or 2");
                    break;
            }
        }

        {
            int value = 2;
            int i = 0;
            switch (value) {
                case 2:
                    i = 2; // Нет break, выполнение продолжается в следующий case
                case 3:
                    i = 3;
                    break;
                case 1:
                    i = 1;
                    break;
                default:
                    i = 4;
                    break;
            }
            System.out.println("i = " + i);
        }
    }
}