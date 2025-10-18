import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> count = new HashMap<>();
        for (String[] c : clothes) {
            String type = c[1];
            count.put(type, count.getOrDefault(type, 0) + 1);
        }
        int answer = 1;
        for (int num : count.values()) {
            answer *= (num + 1);
        }
        return answer - 1;
    }
}
