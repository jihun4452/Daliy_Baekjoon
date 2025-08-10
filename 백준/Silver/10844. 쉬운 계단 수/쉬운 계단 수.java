import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static final long MOD = 1_000_000_000L;
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		long[][] dp = new long[N + 1][10];
		//long으로 일단 초기화
		for(int d= 1; d <= 9; d++) {
			dp[1][d] = 1;
		}
		for(int i=2; i<=N; i++){
			dp[i][0] = dp[i - 1][1]; // 0은 1로만 올 수 있음
			dp[i][9] = dp[i - 1][8];
			for(int d=1; d<=8; d++){
				dp[i][d] = (dp[i - 1][d - 1] + dp[i - 1][d + 1]) % MOD;
			}
		}

		long answer=0;
		for(int d=0; d<=9; d++){
			answer = (answer + dp[N][d]) % MOD;
		}
		System.out.println(answer);
	}
}
