// Файл: Main.java
public class Main {
    public static void main(String[] args) {
        String primarch = "Леман Русс";
        int rating = 85;

        PrimarchUtils.checkRating(primarch, rating);

        int bonus1 = PrimarchUtils.getBonus();
        int bonus2 = PrimarchUtils.getBonus();
        int bonus3 = PrimarchUtils.getBonus();

        int total = rating + bonus1 + bonus2 + bonus3;

        PrimarchUtils.printFinal(primarch, total);
    }
}
