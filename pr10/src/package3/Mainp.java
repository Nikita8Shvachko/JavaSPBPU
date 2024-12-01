// Пакет 3: package3
package package3;

import package1.ParentClass;
import package2.ChildClass;

public class Mainp {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();

        // Доступ к полям ParentClass из другого пакета
        // System.out.println(parent.privateField);   // Ошибка! privateField недоступен
        // System.out.println(parent.defaultField);   // Ошибка! defaultField недоступен
        // System.out.println(parent.protectedField); // Ошибка! protectedField недоступен из другого пакета без наследования
        System.out.println(parent.publicField);       // publicField доступен

        ChildClass child = new ChildClass();
        child.accessFields(); // Проверка доступа в подклассе
    }
}