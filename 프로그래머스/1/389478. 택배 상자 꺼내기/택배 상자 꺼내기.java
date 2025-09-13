public class Solution {
    public int solution(int n, int w, int num) {
        int row = (num - 1) / w;
        int col = (row % 2 == 0) ? (num - 1) % w : w - 1 - (num - 1) % w;

        int count = 1;
        for (int r = row + 1; r * w < n; r++) {
            int start = r * w + 1;
            int end = Math.min(n, (r + 1) * w);
            int width = end - start + 1;

            if (r % 2 == 0) {
                if (col < width) count++;
            } else {
                if (col >= w - width) count++;
            }
        }
        return count;
    }
}
