import java.util.ArrayList;

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


        System.out.println(TournamentUtils.getPrimarchTitle(primarch));

        if (TournamentUtils.isEligible(rating)) {
            System.out.println("Допущен к турниру");
        } else {
            System.out.println("Не допущен к турниру");
        }

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(bonus1);
        scores.add(bonus2);
        scores.add(bonus3);
        scores.add(rating);
        int totalPoints = TournamentUtils.totalPoints(scores);

        System.out.println("Общие очки примарха: " + totalPoints);



        Primarch russ = new Primarch("Леман Русс", 75);
        Primarch magnus = new Primarch("Магнус", 80);

        Tournament.trainPrimarch(russ);
        System.out.println(russ.getInfo());

        Primarch stronger = Tournament.getStrongerPrimarch(russ, magnus);
        System.out.println("Сильнейший: " + stronger.getInfo());

    }
}
