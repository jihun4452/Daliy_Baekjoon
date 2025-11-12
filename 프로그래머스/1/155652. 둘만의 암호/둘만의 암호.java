class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];// 알파벳 26
        for(char c: skip.toCharArray()){
            isSkip[c-'a']= true; //true이면 건너 뛰어야한다.
        }
        
        StringBuilder result = new StringBuilder();
        
        for(char k : s.toCharArray()){
            int moveIndex = 0; //이동한 수 초기화해놓고
            char next = k;
            
            while (moveIndex < index){
                next++; //다음 문자로 이동함
                if(next> 'z') next = 'a'; //다음값이 z보다 크면 a로 다시 간다.
                if(isSkip[next - 'a']) continue; //ture면 건너 뜀
                moveIndex++;
            }
            result.append(next);
        }
        return result.toString();
    }
}