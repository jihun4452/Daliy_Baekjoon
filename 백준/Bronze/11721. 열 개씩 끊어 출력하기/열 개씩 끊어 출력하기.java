import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		char[] c = S.toCharArray();

		for(int i = 0; i<S.length(); i++){
			if(i % 10 == 0 && i!=0){
				System.out.print("\n");
			}
			System.out.print(c[i]);
		}
	}
}
