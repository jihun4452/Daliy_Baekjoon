import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] move = new int[n+1];
		for (int i = 1; i <= n; i++) {
			move[i] = Integer.parseInt(st.nextToken());
		}

		int[] next = new int[n+1], prev = new int[n+1];
		for (int i = 1; i <= n; i++) {
			next[i] = (i == n ? 1 : i + 1);
			prev[i] = (i == 1 ? n : i - 1);
		}

		StringBuilder sb = new StringBuilder();
		int cur = 1;

		for (int cnt = 0; cnt < n; cnt++) {
			sb.append(cur).append(' ');

			int m = move[cur];
			int l = prev[cur], r = next[cur];

			next[l] = r;
			prev[r] = l;
			if (cnt == n - 1) break;

			if (m > 0) {
				cur = r;
				for (int k = 1; k < m; k++) {
					cur = next[cur];
				}
			} else {
				cur = l;
				for (int k = 1; k < -m; k++) {
					cur = prev[cur];
				}
			}
		}

		bw.write(sb.toString().trim());
		bw.flush();
	}
}