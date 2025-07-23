import java.util.Random;

public class Tournament {
    public static void trainPrimarch(Primarch p) {
        Random random = new Random();
        p.increaseRating(random.nextInt(10));
    }

    public static Primarch getStrongerPrimarch(Primarch p1, Primarch p2) {
        return (p1.rating > p2.rating) ? p1 : p2;
    }
}
