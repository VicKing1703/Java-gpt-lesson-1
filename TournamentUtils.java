import java.util.ArrayList;

public class TournamentUtils {

    public static boolean isEligible(int rating) {
        return rating >=80;
    }

    public static String getPrimarchTitle(String name) {
        return "Великий примарх " + name;
    }

    public static int totalPoints(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

}
