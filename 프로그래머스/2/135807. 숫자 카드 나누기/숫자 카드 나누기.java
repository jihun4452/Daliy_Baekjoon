import java.util.*;

class Solution {
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    private long getGCD(int[] arr) {
        long g = arr[0];
        for (int i = 1; i < arr.length; i++) g = gcd(g, arr[i]);
        return g;
    }
    
    private boolean check(long a, int[] arr1, int[] arr2) {
        for (int x : arr1) if (x % a != 0) return false;
        for (int x : arr2) if (x % a == 0) return false;
        return true;
    }
    
    public int solution(int[] arrayA, int[] arrayB) {
        long g1 = getGCD(arrayA), g2 = getGCD(arrayB);
        long ans = 0;
        
        for (long i = 1; i * i <= g1; i++) {
            if (g1 % i == 0) {
                if (check(i, arrayA, arrayB)) ans = Math.max(ans, i);
                if (check(g1/i, arrayA, arrayB)) ans = Math.max(ans, g1/i);
            }
        }
        
        for (long i = 1; i * i <= g2; i++) {
            if (g2 % i == 0) {
                if (check(i, arrayB, arrayA)) ans = Math.max(ans, i);
                if (check(g2/i, arrayB, arrayA)) ans = Math.max(ans, g2/i);
            }
        }
        
        return (int) ans;
    }
}