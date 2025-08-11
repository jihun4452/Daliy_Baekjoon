import java.io.*;

public class Main {
	static final int MOD = 15746;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N + 1];
		dp[1] = 1;
		if(N>=2)dp[2] = 2;

		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % MOD;
		}
		System.out.println(dp[N]);
	}
}
