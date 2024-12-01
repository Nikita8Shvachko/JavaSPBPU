// Практика #1: Что выведет данный код и почему?

// Точка входа в программу
public class Main {
    public static void main(String[] args) {
        new A(100); // Создаем объект класса A с параметром 100
    }
}


//       static logic
// 1.	Статический блок выполняется один раз при первом обращении к классу A, даже перед созданием первого объекта.
//     Поэтому эта строка выводится первой.
// 2.	logic (1) id= 0
//     •	Нестатические блоки выполняются перед вызовом конструктора.
//     •	Поле id ещё не инициализировано явно, но по умолчанию оно имеет значение 0.
//     •	В первом блоке выводится 0.
// 3.	logic (2) id= 1
//     •	После выполнения первого логического блока выполняется инициализация поля id = 1.
//     •	Второй логический блок уже видит id = 1, поэтому выводится logic (2) id= 1.
// 4.	ctor id= 100
//     •	После завершения всех логических блоков вызывается конструктор, который присваивает значение id = 100
//       и выводит ctor id= 100.
//
//     •	Статический блок выполняется один раз при загрузке класса.
//     •	Нестатические блоки выполняются каждый раз при создании объекта, перед вызовом конструктора.
//     •	Инициализация полей происходит после выполнения первого логического блока и перед вторым блоком.