// Файл: Main.java
public class Main {
    public static void main(String[] args) {
        Primarch russ = new Primarch("Леман Русс", 85);
        Primarch dorn = new Primarch("Рогал Дорн", 88);

        russ.fight(dorn); // => Победитель: Рогал Дорн

    }
}
