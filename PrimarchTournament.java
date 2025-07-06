import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PrimarchTournament {
    public static void main(String[] args) {
        // Зададим примархов (будет чесно добавить всех)
        String[] allPrimarchs = {"Хорус Луперкаль", "Леман Русс", "Феррус Манус", "Фулгрим", "Вулкан", "Рогал Дорн",
                "Робаут Жиллиман", "Магнус Красный", "Сангвиний", "Лев Эль'Джонсон", "Пертурабо", "Мортарион",
                "Лоргар Аврелиан", "Джагатай Хан", "Конрад Кёрз", "Ангрон", "Корвус Коракс", "Альфарий Омегон"};

        // Зададим им рандомный рейтинг
        Random random = new Random();
        // Увеличил стартовое значение рейтинга, чтобы была выше вероятность попадания в турнир
        int[] allRatings = {random.nextInt(50, 100), random.nextInt(50, 100),
                random.nextInt(50, 100), random.nextInt(50,100),
                random.nextInt(50, 100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100),
                random.nextInt(50,100), random.nextInt(50,100)};

        //Собираем коллекцию прошедших турнир
        ArrayList<String> primarchs = new ArrayList<>();
        ArrayList<Integer> ratings = new ArrayList<>();

        // Посмотрим на примархов, их рейтинги и отбираем для турнира
        for (int i = 0; i < allPrimarchs.length; i++) {
            System.out.println("Примарх: " + allPrimarchs[i] + ", с рейтингом: " + allRatings[i]);
            // В турнир попадают только с рейтингов выше 80
            if (allRatings[i] > 80) {
                System.out.println(allPrimarchs[i] + " допущен к турниру");
                primarchs.add(allPrimarchs[i]);
                ratings.add(allRatings[i]);
            } else {
                System.out.println(allPrimarchs[i] + " не прошел отбор");
            }
        }

        // Проводим турнир
        if (primarchs.size() < 3) {
            System.out.println("Недостаточно участников");

        } else {
            for (int i = 0; i < primarchs.size(); i++) {
                int currentRating = ratings.get(i);
                for (int j = 0; j < 3; j++) {
                    currentRating += random.nextInt(1, 10);
                }
                ratings.set(i, currentRating);
                System.out.println("Примарх: " + primarchs.get(i) + " по результатам 3-х раундов набрал " +
                        ratings.get(i) + " очков");

            }
        }

        // Результаты турнира
        if (primarchs.size() >= 3) {
            Integer max = Collections.max(ratings);

            // Находим индекс максимального элемента
            int maxIndex = ratings.indexOf(max);

            System.out.println("Победитель турнира, примарх: " + primarchs.get(maxIndex) +
                    " набравший больше всех очков в рейтинге: " + ratings.get(maxIndex));
        }

    }
}


