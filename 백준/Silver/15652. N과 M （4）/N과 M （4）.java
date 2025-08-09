import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int[] pick;
	static StringBuilder sb = new StringBuilder();

	static void dfs(int depth, int start) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(pick[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int x = start; x <= N; x++) {
			pick[depth] = x;
			dfs(depth + 1, x);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//값 받고 넘김
		pick = new int[M];
		dfs(0, 1);
		System.out.print(sb.toString());
	}
}
