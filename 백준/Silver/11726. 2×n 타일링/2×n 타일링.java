import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int MOD = 1000;
		int n = Integer.parseInt(br.readLine());

		long[] dp = new long[MOD + 1];

		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= MOD; i++) {
			dp[i]= (dp[i-2]+dp[i-1])%10007;
		}

		System.out.print(dp[n]);
	}
}