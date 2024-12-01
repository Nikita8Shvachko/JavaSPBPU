// Код классов A и Main
public class A {
    // Нестатический блок 1
    {
        System.out.println("logic (1) id= " + this.id);
    }

    // Статический блок
    static {
        System.out.println("static logic");
    }

    // Поле id инициализируется значением по умолчанию после первого логического блока
    private int id = 1;

    // Конструктор класса
    public A(int id) {
        this.id = id; // Присваиваем значение переданное в конструктор
        System.out.println("ctor id= " + id);
    }

    // Нестатический блок 2
    {
        System.out.println("logic (2) id= " + id);
    }
}
