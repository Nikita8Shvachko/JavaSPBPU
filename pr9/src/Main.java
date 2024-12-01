import java.util.Arrays;

public class Main {
    // Практика #1: Что произойдет в результате выполнения кода

    public static class Practice1 {
        public static void main(String[] args) {
            // Создаем массив a1 с элементами {1, 2, 3, 4, 5}
            int a1[] = {1, 2, 3, 4, 5};
            // Создаем массив a2 с элементами {6, 7, 8, 9, 10}
            int a2[] = {6, 7, 8, 9, 10};

            // Переназначаем ссылку a1 на массив a2
            a1 = a2;

            // Теперь a1 ссылается на тот же массив, что и a2
            for (int i : a1) {
                System.out.print(i + " "); // 6 7 8 9 10
            }
        }
    }
    // Практика #2: Использование методов класса Arrays


    public static class Practice2 {
        public static void main(String[] args) {
            // Исходный массив
            int[] arr = {5, 1, 4, 2, 3};
            System.out.println("Исходный массив: " + Arrays.toString(arr));

            // 1. Сортировка массива
            Arrays.sort(arr);
            System.out.println("Отсортированный массив: " + Arrays.toString(arr)); // [1, 2, 3, 4, 5]

            // 2. Двоичный поиск элемента 4
            int index = Arrays.binarySearch(arr, 4);
            System.out.println("Индекс элемента 4: " + index); // 3

            // 3. Сравнение двух массивов на равенство
            int[] arr2 = {1, 2, 3, 4, 5};
            System.out.println("arr равно arr2? " + Arrays.equals(arr, arr2)); // true

            // 4. Лексикографическое сравнение массивов
            int[] arr3 = {1, 2, 6};
            System.out.println("Сравнение arr и arr3: " + Arrays.compare(arr, arr3)); // -1

            // 5. Сравнение массивов с помощью equals (проверка разницы)
            int[] arr4 = {1, 2, 3, 4, 6};
            System.out.println("arr равно arr4? " + Arrays.equals(arr, arr4)); // false
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        Практика #1: Что произойдет в результате выполнения кода?
        Practice1.main(args);

//        Практика #2: Изучение класса java.util.Arrays

        Practice2.main(args);


    }
}