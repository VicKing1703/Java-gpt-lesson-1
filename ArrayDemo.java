public class ArrayDemo {
    public static void main(String[] args) {
        String[] primarchs = {"Магнус", "Альфарий", "Леман Русс", "Вулкан", "Ягатай Хан"};

        for (int i = 0; i < primarchs.length; i++) {
            System.out.println("Примарх №" + (i + 1) + ": " + primarchs[i]);
        }

        for (String primarch : primarchs) {
            System.out.println("Слава примарху: " + primarch + "!");
        }

        System.out.println("Всего примархов: " + primarchs.length);

        int[] ages = {30, 27, 36, 33, 41};

        for (int i = 0; i < primarchs.length; i++) {
            System.out.println("Имя: " + primarchs[i] + ", Возраст: " + ages[i]);
        }
    }
}
