public class PrimarchsLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Примарх " + i + " - в строю!");
        }

        int power = 50;
        while (power < 100) {
            System.out.println("Мощность: " + power);
            power += 10;
        }

        int day = 1;
        do {
            System.out.println("День " + day + ": подготовка к крестовому походу");
            day++;
        } while (day <= 3);
    }
}
