import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
		int[] s= new int[n+1];
		for(int i=1; i<=n; i++){
			s[i]=Integer.parseInt(br.readLine());
		}
		if (n == 1) {
			System.out.println(s[1]); return; 
		}
		if (n == 2) {
			System.out.println(s[1] + s[2]); return;
		}
		//처음과 둘중에 더 큰걸 가져가야한다.
		int[] dp=new int[n+1];
		dp[1] = s[1];
		dp[2] = s[1]+s[2];
		dp[3] = Math.max(s[1] + s[3], s[2]+ s[3]);
		for(int i=4; i<=n; i++){
			dp[i] =  Math.max(dp[i-2] + s[i], dp[i-3]+s[i-1]+s[i]);
		}// i-1 말고 i-2 밟고 바로 최종으로 올라오는것
		//i-3 밟고, i-1 i 로 간다.

		System.out.println(dp[n]);
	}
}
