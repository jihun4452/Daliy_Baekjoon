import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int cnt = n - i; 
            if (citations[i] >= cnt) {
                return cnt; 
            }
        }
        return 0; // 모든 경우를 못 만족하면 0
    }
}
