public class Main {
//    Практика #1: Демонстрация функциональности методов StringBuffer и StringBuilder

    public static class StringBufferStringBuilderDemo {
        public static void main(String[] args) {
            // Работаем со StringBuilder
            StringBuilder sb = new StringBuilder("Hello");

            // 1. append() - добавляет строку в конец
            sb.append(" World!");
            System.out.println("After append: " + sb);

            // 2. insert() - вставляет строку по указанному индексу
            sb.insert(6, "Java ");
            System.out.println("After insert: " + sb);

            // 3. replace() - заменяет текст в указанном диапазоне
            sb.replace(6, 10, "Kotlin");
            System.out.println("After replace: " + sb);

            // 4. delete() - удаляет текст в указанном диапазоне
            sb.delete(6, 12);
            System.out.println("After delete: " + sb);

            // 5. reverse() - переворачивает строку
            sb.reverse();
            System.out.println("After reverse: " + sb);
            sb.reverse(); // возвращаем строку к исходному состоянию

            // 6. charAt() - возвращает символ по индексу
            System.out.println("Character at index 4: " + sb.charAt(4));

            // 7. length() - возвращает длину строки
            System.out.println("Length of StringBuilder: " + sb.length());

            // Работаем со StringBuffer
            StringBuffer sbf = new StringBuffer("Buffer");

            // 8. capacity() - возвращает текущую емкость буфера
            System.out.println("Initial capacity: " + sbf.capacity());

            // 9. ensureCapacity() - гарантирует минимальную емкость
            sbf.ensureCapacity(50);
            System.out.println("Capacity after ensureCapacity: " + sbf.capacity());

            // 10. substring() - возвращает подстроку
            String sub = sbf.substring(1, 4);
            System.out.println("Substring (1, 4): " + sub);
        }
    }

    public static class StringConversionDemo {
        public static void main(String[] args) {
            // Преобразование String -> StringBuffer и StringBuilder
            String str = "Hello";

            StringBuffer stringBuffer = new StringBuffer(str); // String -> StringBuffer
            StringBuilder stringBuilder = new StringBuilder(str); // String -> StringBuilder

            System.out.println("StringBuffer: " + stringBuffer);
            System.out.println("StringBuilder: " + stringBuilder);

            // Преобразование StringBuffer -> String
            String stringFromBuffer = stringBuffer.toString();
            System.out.println("String from StringBuffer: " + stringFromBuffer);

            // Преобразование StringBuilder -> String
            String stringFromBuilder = stringBuilder.toString();
            System.out.println("String from StringBuilder: " + stringFromBuilder);

            // Преобразование StringBuffer -> StringBuilder
            StringBuilder builderFromBuffer = new StringBuilder(stringBuffer);
            System.out.println("StringBuilder from StringBuffer: " + builderFromBuffer);

            // Преобразование StringBuilder -> StringBuffer
            StringBuffer bufferFromBuilder = new StringBuffer(stringBuilder);
            System.out.println("StringBuffer from StringBuilder: " + bufferFromBuilder);
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice #1:");

//        System.out.println("Hello, World!");
        StringBufferStringBuilderDemo.main(args);
        System.out.println("\nPractice #2:");
        StringConversionDemo.main(args);
    }
}