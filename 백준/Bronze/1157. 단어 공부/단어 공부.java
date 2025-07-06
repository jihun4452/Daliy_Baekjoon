import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();  

		int[] counts = new int[26];
		for (char c : s.toCharArray()) {
			counts[c - 'A']++;
		}

		int max = -1;
		char result = '?';
		boolean duplicate = false;
		for (int i = 0; i < 26; i++) {
			if (counts[i] > max) {
				max = counts[i]; 
				result = (char) ('A' + i); 
				duplicate = false;       
			} else if (counts[i] == max) {
				duplicate = true;        
			}
		}

		System.out.println(duplicate ? '?' : result);
	}
}