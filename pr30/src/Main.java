//Практика #1: Пример использования десяти методов класса String
/*

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length() - возвращает длину строки
        System.out.println("Длина строки: " + str.length());

        // 2. charAt() - возвращает символ по указанному индексу
        System.out.println("Символ на индексе 7: " + str.charAt(7));

        // 3. substring() - извлекает подстроку
        System.out.println("Подстрока с индекса 7: " + str.substring(7));

        // 4. toUpperCase() - преобразует строку в верхний регистр
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());

        // 5. toLowerCase() - преобразует строку в нижний регистр
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());

        // 6. replace() - заменяет все вхождения символа или подстроки на другой
        System.out.println("Заменить 'World' на 'Java': " + str.replace("World", "Java"));

        // 7. contains() - проверяет, содержит ли строка подстроку
        System.out.println("Содержит ли строка 'World'? " + str.contains("World"));

        // 8. startsWith() - проверяет, начинается ли строка с указанной подстроки
        System.out.println("Начинается ли строка с 'Hello'? " + str.startsWith("Hello"));

        // 9. endsWith() - проверяет, заканчивается ли строка на указанную подстроку
        System.out.println("Заканчивается ли строка на '!'? " + str.endsWith("!"));

        // 10. trim() - удаляет пробелы в начале и в конце строки
        String strWithSpaces = "  Hello, World!  ";
        System.out.println("Строка без пробелов в начале и в конце: '" + strWithSpaces.trim() + "'");
    }
}
*/

//Объяснение методов:
//        1.	length() — возвращает количество символов в строке.
//	2.	charAt(int index) — возвращает символ строки по указанному индексу.
//        3.	substring(int beginIndex) — возвращает подстроку, начиная с указанного индекса до конца.
//	4.	toUpperCase() — преобразует строку в верхний регистр.
//	5.	toLowerCase() — преобразует строку в нижний регистр.
//	6.	replace(CharSequence target, CharSequence replacement) — заменяет все вхождения подстроки target на подстроку replacement.
//        7.	contains(CharSequence sequence) — проверяет, содержится ли подстрока в строке.
//	8.	startsWith(String prefix) — проверяет, начинается ли строка с указанного префикса.
//        9.	endsWith(String suffix) — проверяет, заканчивается ли строка на указанный суффикс.
//        10.	trim() — удаляет пробелы в начале и в конце строки.
//
//Практика #2: Пример использования класса StringJoiner
//
//Класс StringJoiner был введен в Java 8 и используется для создания строк с разделителями. Он позволяет удобно объединять строки с указанным разделителем.
//
/*        import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавление строк в StringJoiner
        joiner.add("apple");
        joiner.add("banana");
        joiner.add("cherry");

        // Печать объединенной строки
        System.out.println(joiner.toString());

        // StringJoiner с префиксом и суффиксом
        StringJoiner joinerWithPrefixSuffix = new StringJoiner(", ", "[", "]");
        joinerWithPrefixSuffix.add("apple").add("banana").add("cherry");

        // Печать строки с префиксом и суффиксом
        System.out.println(joinerWithPrefixSuffix.toString());
    }
}*/

//Вывод программы:

//apple, banana, cherry
//[apple, banana, cherry]

//Объяснение:
//        •	StringJoiner позволяет объединять строки с использованием заданного разделителя.
//        •	Также можно добавлять префикс и суффикс к результату с помощью конструктора, принимающего их как параметры.
//        •	Метод toString() возвращает объединенную строку с разделителями.
//
//Практика #3: Зачем нужны три двойные кавычки?
//
//Три двойные кавычки (""") используются в Java с версии 13 для создания многострочных строк, также известных как text blocks. Они упрощают работу с многострочными литералами, автоматически форматируя их, включая новые строки и сохранение всех символов.
//
//Пример:
/*
public class TextBlockExample {
    public static void main(String[] args) {
        String textBlock = """
                     Это пример многострочной строки,
                     которая сохраняет все символы,
                     включая переносы строк.
                             """;
        
        System.out.println(textBlock);
    }
}*/

//Вывод программы:
//
//Это пример многострочной строки,
//которая сохраняет все символы,
//включая переносы строк.
//
//Объяснение:
//	•	Многострочные строки, или text blocks, начинаются и заканчиваются тремя двойными кавычками.
//	•	В таких строках сохраняются все символы, включая пробелы, табуляции и переносы строк, что упрощает работу с текстом в коде.
//	•	Они полезны, например, при работе с JSON, HTML или SQL-запросами, где важно сохранить форматирование и удобство чтения.