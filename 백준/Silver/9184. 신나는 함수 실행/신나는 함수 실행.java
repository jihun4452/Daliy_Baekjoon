import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int[][][] dp = new int[21][21][21];

	static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) return 1;
		if (a > 20 || b > 20 || c > 20) return w(20, 20, 20);

		if (dp[a][b][c] != 0) return dp[a][b][c];

		if (a < b && b < c) {
			dp[a][b][c] = w(a, b, c - 1)
				+ w(a, b - 1, c - 1)
				- w(a, b - 1, c);
		} else {
			dp[a][b][c] = w(a - 1, b, c)
				+ w(a - 1, b - 1, c)
				+ w(a - 1, b, c - 1)
				- w(a - 1, b - 1, c - 1);
		}
		return dp[a][b][c];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		while (true) {
			String line = br.readLine();
			if (line == null || line.isEmpty()) break;
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) break;

			int ans = w(a, b, c);
			out.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
				.append(ans).append("\n");
		}
		System.out.print(out.toString());
	}
}
