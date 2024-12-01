// Пакет 2: package2
package package2;

import package1.ParentClass;

// Класс, который наследуется от ParentClass
public class ChildClass extends ParentClass {
    public void accessFields() {
//         System.out.println(privateField);   // Ошибка! privateField недоступен
//         System.out.println(defaultField);   // Ошибка! defaultField недоступен из другого пакета
        System.out.println(protectedField);   // protectedField доступен, так как это подкласс
        System.out.println(publicField);      // publicField доступен из любого места
    }
}