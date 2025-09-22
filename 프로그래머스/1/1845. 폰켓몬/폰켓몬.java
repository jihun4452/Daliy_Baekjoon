import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        
        int pick = nums.length / 2;
        
        return Math.min(set.size(), pick);
    }
}
