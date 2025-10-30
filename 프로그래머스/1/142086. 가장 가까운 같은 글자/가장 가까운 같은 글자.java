class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        char[] c = s.toCharArray();

        for (int i = 0; i < len; i++) {
            answer[i] = -1; // 기본값
            for (int j = i - 1; j >= 0; j--) {
                if (c[i] == c[j]) {
                    answer[i] = i - j;
                    break; // 가장 가까운 같은 글자를 찾았으니 멈춤
                }
            }
        }
        return answer;
    }
}