import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num:arr){
            if(stack.isEmpty() || stack.peek()!=num){
                stack.push(num);
            }
            //num과, 스택 다음것이 같지않다면 푸시함
        }
        
        int[] answer = new int[stack.size()];
        for(int i= 0; i <stack.size(); i++){
            answer[i] = stack.get(i);
        }
        //정답 다 담고 get으로 하나씩 저장
        return answer;
    }
}