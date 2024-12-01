public class Main {
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String russianName;

        // Конструктор для инициализации значений
        Day(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }
    }

    public enum WeekDay {
        MONDAY(1),
        TUESDAY(1),
        WEDNESDAY(1),
        THURSDAY(1),
        FRIDAY(1),
        SATURDAY(0),
        SUNDAY(0);

        private int workingHours;

        // Конструктор для инициализации количества рабочих часов
        WeekDay(int workingHours) {
            this.workingHours = workingHours;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        // Статический метод для вычисления общего количества рабочих часов в неделю
        public static int getTotalWorkingHours() {
            int total = 0;
            for (WeekDay day : WeekDay.values()) {
                total += day.getWorkingHours();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        {
            Day day = Day.MONDAY;

            System.out.println("Day in Russian: " + day.getRussianName()); // Выведет "Понедельник"

            switch (day) {
                case MONDAY:
                    System.out.println("Начало недели!");
                    break;
                case FRIDAY:
                    System.out.println("Пятница!");
                    break;
                default:
                    System.out.println("Другой день");
            }
        }


//

        { // Печать рабочего времени для каждого дня недели
            for (WeekDay day : WeekDay.values()) {
                System.out.println(day + " имеет " + day.getWorkingHours() + " рабочих часов.");
            }

            // Печать общего количества рабочих часов в неделе
            System.out.println("Общее количество рабочих часов в неделю: " + WeekDay.getTotalWorkingHours());
        }
    }
}

