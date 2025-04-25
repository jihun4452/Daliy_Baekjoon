class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag?a+b:a-b;
    }
    public static void main(String[] args){
        Solution al= new Solution();
        int result = al.solution(-4,7,true);
        System.out.println(result);
    }
}