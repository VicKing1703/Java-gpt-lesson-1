// Файл: PrimarchUtils.java
public class PrimarchUtils {

    // Метод выводит статус допуска
    public static void checkRating(String name, int rating) {
        if (rating > 80) {
            System.out.println(name + " допущен к турниру");
        } else {
            System.out.println(name + " не прошёл отбор");
        }
    }

    // Метод возвращает бонус рейтинга
    public static int getBonus() {
        return (int) (Math.random() * 10) + 1;
    }

    // Метод печатает итог
    public static void printFinal(String name, int total) {
        System.out.println(name + " набрал " + total + " очков");
    }
}
