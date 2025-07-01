import java.util.ArrayList;

public class PrimarchListDemo {
    public static void main(String[] args) {

        // Создаём коллекцию примархов
        ArrayList<String> primarchs = new ArrayList<>();

        // Добавляем пяток примархов
        primarchs.add("Корвус Коракс");
        primarchs.add("Мортарион");
        primarchs.add("Сангвинний");
        primarchs.add("Робаут Жиллиман");
        primarchs.add("Альфарий");

        // Выводимв всех имеющихся приархов
        for (String primarch : primarchs) {
            System.out.println(primarch);
        }

         // Удаление второго в списке примарха
        primarchs.remove("Мортарион");

        // Выводим количество оставшихся примархов
        System.out.println(primarchs.size());

        //Проверка, есть ли Альфарий в списке
        if (primarchs.contains("Альфарий")) {
            System.out.println("Альфарий здесь, но ты не узнаешь где :)");
        } else {
            System.out.println("Ты его не видишь, но он есть");
        }

        // Проверка уровня силы
        ArrayList<Integer> powerLevels = new ArrayList<>();
        powerLevels.add(77);
        powerLevels.add(88);
        powerLevels.add(89);
        powerLevels.add(999);
        if (primarchs.size() == powerLevels.size()) {
            for (int i = 0; i < primarchs.size(); i++) {
                String primarch = primarchs.get(i);
                System.out.println(primarch + " - уровень силы: " + powerLevels.get(i));
            }
        } else {
            System.out.println("Что-то не сходятся силы с Примархами");
        }
    }
}
