import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] seq;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		seq = new int[M];

		dfs(0);
		System.out.print(sb.toString());
	}

	static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(seq[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			seq[depth] = i;
			dfs(depth + 1);
		}
	}
}
