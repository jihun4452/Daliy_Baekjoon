import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("A+", 4.3); scoreMap.put("A0", 4.0); scoreMap.put("A-", 3.7);
        scoreMap.put("B+", 3.3); scoreMap.put("B0", 3.0); scoreMap.put("B-", 2.7);
        scoreMap.put("C+", 2.3); scoreMap.put("C0", 2.0); scoreMap.put("C-", 1.7);
        scoreMap.put("D+", 1.3); scoreMap.put("D0", 1.0); scoreMap.put("D-", 0.7);
        scoreMap.put("F", 0.0);

        System.out.println(scoreMap.get(grade));
    }
}
