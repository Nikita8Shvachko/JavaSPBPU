/**
 * Класс демонстрирует базовые операции с целыми числами.
 *
 * @author Иван Иванов
 * @version 1.0
 * @since 2024
 */
public class MathOperations {

    /**
     * Метод складывает два целых числа.
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод вычитает одно число из другого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return результат вычитания b из a
     * @throws IllegalArgumentException если результат меньше нуля
     */
    public int subtract(int a, int b) {
        int result = a - b;
        if (result < 0) {
            throw new IllegalArgumentException("Результат не может быть меньше нуля");
        }
        return result;
    }
}
