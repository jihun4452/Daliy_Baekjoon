import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


class Solution {
    public static int[] solution(int[] number){
		Set<Integer> set=new TreeSet<>();

		for(int i=0; i<number.length-1; i++){
			for(int j=i+1; j<number.length; j++){
				set.add(number[i]+number[j]);
			}
		}

		return set.stream().mapToInt(Integer::intValue).toArray();
	}
}