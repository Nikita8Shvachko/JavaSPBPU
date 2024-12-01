//public enum WeekDay {
//    MONDAY(1),
//    TUESDAY(1),
//    WEDNESDAY(1),
//    THURSDAY(1),
//    FRIDAY(1),
//    SATURDAY(0),
//    SUNDAY(0);
//
//    private int workingHours;
//
//    // Конструктор для инициализации количества рабочих часов
//    WeekDay(int workingHours) {
//        this.workingHours = workingHours;
//    }
//
//    public int getWorkingHours() {
//        return workingHours;
//    }
//
//    // Статический метод для вычисления общего количества рабочих часов в неделю
//    public static int getTotalWorkingHours() {
//        int total = 0;
//        for (WeekDay day : WeekDay.values()) {
//            total += day.getWorkingHours();
//        }
//        return total;
//    }
//}
