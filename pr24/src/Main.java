class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Сначала проверяем, не сравниваем ли мы объект с самим собой
        if (this == obj) {
            return true;
        }

        // Проверяем, является ли объект того же типа
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приводим obj к типу Person
        Person person = (Person) obj;

        // Сравниваем важные поля: имя и возраст
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        Person p3 = new Person("Alice", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(null)); // false
    }
}
//Соглашения для реализации метода equals():
//
//        1.	Рефлексивность: Для любого объекта x, выражение x.equals(x) должно возвращать true.
//        2.	Симметричность: Если объект x равен объекту y, то объект y должен быть равен объекту x.
//	      3.	Транзитивность: Если объект x равен объекту y, а объект y равен объекту z, то объект x должен быть равен объекту z.
//        4.	Согласованность: Если два объекта равны, вызовы метода equals() для этих объектов должны всегда возвращать одно и то же значение.
//        5.	Нулевое сравнение: Любой объект, который сравнивается с null, должен возвращать false (за исключением самого себя).