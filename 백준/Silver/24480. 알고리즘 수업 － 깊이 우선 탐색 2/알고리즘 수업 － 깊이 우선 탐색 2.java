import java.io.*;
import java.util.*;

public class Main {
	static int N, M, R;
	static List<Integer>[] adj;
	static int[] order;
	static boolean[] visited;
	static int cnt = 0;

	public static void dfs(int v) {
		visited[v] = true;
		order[v] = ++cnt;
		for (int nx : adj[v]) {
			if (!visited[nx]) {
				dfs(nx);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		adj = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			adj[u].add(v);
			adj[v].add(u);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(adj[i], Collections.reverseOrder());
		}

		order = new int[N + 1];
		visited = new boolean[N + 1];

		dfs(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(order[i]).append('\n');
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
