import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine().toLowerCase();

		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if(arr[c-'a'] !=-1){
					continue;
				}
				arr[c - 'a']= i; 
			}
		}
		for(int i=0; i<26; i++){
			System.out.print(arr[i]+" ");
		}
	}
}