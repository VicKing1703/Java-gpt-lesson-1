public class Primarch {
    String name;
    int rating;

    public Primarch(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", с рейтингом: " + rating);
    }

    public void fight(Primarch opponent) {
        if (rating > opponent.rating) {
            System.out.println("Побеждает примарх: " + name + ", набравший " + rating + " очков!");
        } else {
            System.out.println("Побеждает примарх: " + opponent.name + ", набравший " + opponent.rating + " очков!");
        }
    }
}
