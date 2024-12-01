// Практика #1: Пример демонстрации спецификаторов доступа

// Пакет 1: package1
package package1;

// Класс с разными спецификаторами доступа
public class ParentClass {

    // private: доступен только внутри ParentClass
    private String privateField = "privateField (доступен только в ParentClass)";

    // Доступ по умолчанию: доступен внутри package1
    String defaultField = "defaultField (доступен внутри package1)";

    // protected: доступен в package1 и в наследниках из других пакетов
    protected String protectedField = "protectedField (доступен в package1 и в наследниках)";

    // public: доступен всем
    public String publicField = "publicField (доступен всем)";

    // Методы для вывода значений полей
    public void printFields() {
        System.out.println(privateField);   // Доступен
        System.out.println(defaultField);   // Доступен
        System.out.println(protectedField); // Доступен
        System.out.println(publicField);    // Доступен
    }
}