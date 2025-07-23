public class Primarch {
    String name;
    int rating;

    public Primarch(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void increaseRating(int bonus) {
        this.rating += bonus;
    }

    public String getInfo() {
        return name + " с рейтингом " + rating;
    }
}
