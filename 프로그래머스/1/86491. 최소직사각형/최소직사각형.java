class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {
            int w = card[0];
            int h = card[1];

            if (w < h) {
                int temp = w;
                w = h;
                h = temp;
            }

            if (w > maxWidth) maxWidth = w;
            if (h > maxHeight) maxHeight = h;
        }

        return maxWidth * maxHeight;
    }
}
