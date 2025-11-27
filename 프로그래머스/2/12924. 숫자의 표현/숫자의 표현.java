class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;
                if (d1 % 2 == 1) count++;
                if (d2 % 2 == 1 && d1 != d2) count++;
            }
        }
        return count;
    }
}
