public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};

        // Цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }

        // Вызовы методов (2)
        a.printNum(new Integer(1)); // Вызов с Integer
        a.printNum(11);             // Вызов с int
        a.printNum(1.11f);          // Вызов с Float
        a.printNum(11.11);          // Вызов с double (неявно через Number)
    }
}
//Объяснение различий между вызовами в цикле for (1) и последующими вызовами (2)
//
//	      1.	Перегрузка методов в классе A основана на типе аргумента, который передается в метод printNum().
//        2.	Во время выполнения цикла for (1):
//        •	Аргумент переменной n имеет тип Number, поскольку массив num определен как Number[].
//        •	В каждой итерации цикла компилятор видит, что переменная n имеет тип Number. Соответственно, вызывается метод printNum(Number n) для всех элементов массива, даже если фактический объект может быть Integer, Float или Double.
//        3.	В последующих вызовах (2):
//        •	Вызов метода напрямую использует конкретные типы (Integer, int, Float, double), поэтому компилятор выбирает наиболее подходящий метод на этапе компиляции.
//        •	Например:
//        •	a.printNum(new Integer(1)); вызывает printNum(Integer i).
//        •	a.printNum(11); вызывает printNum(int i).
//        •	a.printNum(1.11f); вызывает printNum(Float f).
//        •	a.printNum(11.11); вызывает printNum(Number n), так как double не имеет собственного метода, а ближайший подходящий вариант — метод для Number.
//
//Почему разные результаты?
//
//        •	В цикле for (1) компилятор всегда выбирает метод printNum(Number n), потому что тип переменной n — это Number.
//        •	Во вызовах (2) компилятор знает точный тип переданного аргумента и вызывает более конкретные перегруженные методы.
