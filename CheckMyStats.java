public class CheckMyStats {
    public static void main(String[] args) {
        int age = 38;
        double weight = 128.8;
        boolean lovesWH40K = true;

        if (age < 30) {
            System.out.println("Ты ещё моложе Лемана Русса");
        } else if (age >= 30 && age < 50) {
            System.out.println("В расцвете сил, как Вулкан!");
        } else {
            System.out.println("Опытен, как Малькадор");
        }

        if (weight > 120) {
            System.out.println("Твоя масса достойна dreadnought-а!");
        } else {
            System.out.println("Лёгкий и манёвренный, как Скаут");
        }

        if (lovesWH40K) {
            System.out.println("Пусть Империум процветает!");
        } else {
            System.out.println("У тебя всё впереди");
        }
    }
}
