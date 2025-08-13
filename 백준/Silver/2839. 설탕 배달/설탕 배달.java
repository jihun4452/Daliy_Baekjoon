import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// dp[i] = i kg을 정확히 만들 때 최소 봉지 수, 불가능이면 -1
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0; // 0kg은 봉지 0개

		for (int i = 1; i <= n; i++) {
			int from3 = (i >= 3) ? dp[i - 3] : -1;
			int from5 = (i >= 5) ? dp[i - 5] : -1;

			if (from3 == -1 && from5 == -1) {
				dp[i] = -1;
			} else if (from3 == -1) {
				dp[i] = from5 + 1;// 5에서만 올 수 있음
			} else if (from5 == -1) {
				dp[i] = from3 + 1;// 3에서만 올 수 있음
			} else {
				dp[i] = Math.min(from3, from5) + 1; // 둘 다 가능하면 더 작은 쪽 +1
			}
		}

		System.out.println(dp[n]);
	}
}
