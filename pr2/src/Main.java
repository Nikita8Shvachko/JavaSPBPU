import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int ii = 1;
        {
        /*Практика #1
        Приведите примеры для всех типов данных. Примеры должны также включать нулевые значения.*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;

            byte b = 1;
            short s = 11234;
            char c = 'a';
            int i = 123456789;
            long l = 1234567898;
            float f = 123456789.123456789F;
            double d = 8943753.934875345;

            System.out.println("byte " + b);
            System.out.println("short " + s);
            System.out.println("char " + c);
            System.out.println("int " + i);
            System.out.println("long " + l);
            System.out.println("float " + f);
            System.out.println("double " + d);
        }

        {
        /*Практика #2
        Напечатайте в консоли свое имя, используя при этом символы в формате Unicode ('\\uXXXX').*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;

            String name = "Никита";
            String nameUnicode = "";
            nameUnicode += '\u041D';
            nameUnicode += '\u0438';
            nameUnicode += '\u043A';
            nameUnicode += '\u0438';
            nameUnicode += '\u0442';
            nameUnicode += '\u0430';
            System.out.printf("%s в формате Unicode = %s\n", name, nameUnicode);
        }
        {
        /*Практика #3
        Какое значение будет в переменной c после выполнения данного кода?*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;
            System.out.println("int a = 1;\n{\nint b = 2;\n}\nint c = a + b;\n");
            System.out.println("Выведет ошибку так как область видимости переменной b закончилась до ее использования");

        }
        {
        /*Практика #4
        Приведите пример использования перегруженного оператора + с объектами типа String и переменными
        принадлежащим другим типам (объектам и базовым типам).*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;
            System.out.println("Привет, " + 42);  // Привет, 42

            List<String> colors = new ArrayList<>();
            colors.add("Красный");
            colors.add("Зеленый");
            colors.add("Синий");

            System.out.println("Цвета: " + colors);  // Цвета: [Красный, Зеленый, Синий]
        }

        {
        /*Практика #5
        Приведите примеры, когда арифметические операции выполняются с переменными различных типов. Объясните результат.*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;
            int a = 5;
            double b = 3.5;

            double result = a + b;
            System.out.println(result);  // 8.5
        }
        {/*Практика #6
        Приведите примеры сужающего преобразования типов.*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;
            {
                double a = 3.5;
                int b = (int) a;
                System.out.println("1: " + b);  // 3
            }
            {
                long a = 12345678910L;
                int b = (int) a;
                System.out.println("2: " + b);  //  -539222978
            }
            {
                float a = 128.5f;
                byte b = (byte) a;
                System.out.println("3: " + b);  // -128
            }
            {
                char a = 'A';
                short b = (short) a;
                System.out.println("4: " + b);  // 65
            }
        }
        {/* Практика #7
        Какое значение будет в переменных b, с и d после выполнения данного кода.
        Объясните полученный результат
        */
            System.out.printf("-------\nEx %d\n", ii);
            ii++;

//            int a = 120;
//            byte b = a + 10;
//            byte c = (byte) (a + 10);
//            byte d = a + 1;
            /*
            --java:incompatible types:possible lossy conversion from int to byte

            В Java, когда пытаемся присвоить значение типа int переменной типа byte,компилятор выдает ошибку
            "java: incompatible types: possible lossy conversion from int to byte".Это происходит потому, что тип
            byte имеет меньшую разрядность, чем тип int,и поэтому часть значащих бит может быть потеряна
            при преобразовании.

            В нашем случае, переменная a имеет тип int и значение 120. Когда мы пытаемся присвоить значение a +10
            переменной b типа byte,компилятор выдает ошибку, потому что результат выражения a +10 имеет тип int,а не
            byte.

                    Чтобы исправить эту ошибку, мы можем использовать явное приведение типов( byte)для переменной
            a + 10, как мы сделали для переменной c.Это позволит компилятору выполнить сужающее преобразование типов и
            присвоить значение переменной b.

*/
        }
        {/*Практика #8
        Самостоятельно изучите, что означает type interface и приведите пример с использование var.*/
            System.out.printf("-------\nEx %d\n", ii);
            ii++;

//            В этом примере, мы объявляем интерфейс Printable с методом print ().Затем, мы создаем класс
//            Document, который реализует интерфейс Printable.
//
            interface Printable {
                void print();
            }

            class Document implements Printable {
                public void print() {
                    System.out.println("Printing document...");
                }
            }
//            Типа main (){
            var document = new Document();
            document.print(); // Printing document...
            //}
//                В методе main (), мы объявляем переменную document с помощью ключевого слова var и инициализируем
//            ее объектом класса Document. Затем, мы вызываем метод print() на объекте document, который выводит сообщение
//            "Printing document...".
//            В этом примере, мы используем ключевое слово var для объявления переменной document, и
//            компилятор автоматически определяет ее тип как Document.


        }
    }
}