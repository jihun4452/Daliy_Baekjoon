import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[101];

		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;

		for (int i = 4; i <= 100; i++) {
			dp[i] = dp[i - 3] + dp[i - 2];

		}

		for (int i = 0; i < N; i++) {
			int t = Integer.parseInt(br.readLine());
			bw.write(Long.toString(dp[t]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
