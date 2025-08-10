import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static final long MOD = 1_000_000_007L;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] dp = new long[N + 1];
		dp[0] = 1; // A일수밖에 없음, 그래서 1개만 넣는다.

		for (int i = 1; i <= N; i++) {
			dp[i] = dp[i - 1];
			if (i >= M) dp[i] = (dp[i] + dp[i - M]) % MOD;
		}

		System.out.println(dp[N] % MOD);
	}
}
