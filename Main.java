
public class Main {
    public static void main(String[] args) {
        Primarch russ = new Primarch("Леман Русс", 75);
        Primarch magnus = new Primarch("Магнус", 80);

        Tournament.trainPrimarch(russ);
        System.out.println(russ.getInfo());

        Primarch stronger = Tournament.getStrongerPrimarch(russ, magnus);
        System.out.println("Сильнейший: " + stronger.getInfo());

    }
}
