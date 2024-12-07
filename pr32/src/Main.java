import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Date;

public class Main {

    //    Практика #1: Пример использования пяти спецификаторов
    static public class FormatterExample {
        public static void main(String[] args) {
            Formatter formatter = new Formatter();

            // Спецификатор %b - Логическое значение
            boolean bool = true;
            formatter.format("Boolean value: %b%n", bool);

            // Спецификатор %c - Символьное представление
            char ch = 'A';
            formatter.format("Character: %c%n", ch);

            // Спецификатор %d - Целое десятичное значение
            int number = 12345;
            formatter.format("Decimal integer: %d%n", number);

            // Спецификатор %f - Значение с плавающей точкой
            double floatingPoint = 123.456;
            formatter.format("Floating-point number: %f%n", floatingPoint);

            // Спецификатор %% - Вставка знака %
            formatter.format("Percentage sign: %%");

            System.out.println(formatter);
            formatter.close();
        }
    }


    //    Практика #2: Зачем нужен метод flush()
    static public class FlushExample {
        public static void main(String[] args) {
            PrintWriter writer = new PrintWriter(System.out);
            writer.print("This will be printed only after flush.");
            writer.flush(); // Данные выводятся немедленно
            writer.close();
        }
    }

    //    Практика #3: Пример использования спецификаторов для времени и даты
    static class DateFormatterExample {
        public static void main(String[] args) {
            Formatter formatter = new Formatter();
            Date date = new Date();

            // Спецификатор %tH - Час (00-23)
            formatter.format("Hour (24-hour): %tH%n", date);

            // Спецификатор %tM - Минуты
            formatter.format("Minutes: %tM%n", date);

            // Спецификатор %tB - Полное название месяца
            formatter.format("Full month name: %tB%n", date);

            // Спецификатор %tY - Год в четырехзначном формате
            formatter.format("Year (4 digits): %tY%n", date);

            // Спецификатор %tA - Полное название дня недели
            formatter.format("Day of the week: %tA%n", date);
            formatter.format("Date : %tD%n", date);

            System.out.println(formatter);
            formatter.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("Практика #1");
        FormatterExample.main(args);

        System.out.println("Практика #2");
        FlushExample.main(args);

        System.out.println("Практика #3");
        DateFormatterExample.main(args);
    }
}