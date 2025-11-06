public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] divisorCount = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCount[j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            int atk = divisorCount[i];
            if (atk > limit) {
                atk = power;
            }
            answer += atk;
        }

        return answer;
    }
}
