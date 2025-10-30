class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int idx = 0;
        
        // 일단 단어별로 짝수는 대문자, 홀수는 소문자로 해야 함,, 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 공백을 만나면 인덱스를 다시 0으로 돌려야 함... 안 하면 다음 단어랑 섞임
            if (c == ' ') {
                sb.append(c);
                idx = 0; 
            } else {
                // 짝수면 대문자, 홀수면 소문자로 바꿔야 함
                sb.append((idx % 2 == 0) ? Character.toUpperCase(c)
                                          : Character.toLowerCase(c));
                idx++;
            }
        }
        
        // 여기까지면 될 듯, 따로 trim은 안 해도 됨
        return sb.toString();
    }
}
