import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, R;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] order;
	static boolean[] visited;

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		order[start] = 1;
		q.offer(start);
		int cnt = 1;

		while (!q.isEmpty()) {
			int u = q.poll();
			for (int v : graph.get(u)) {
				if (!visited[v]) {
					visited[v] = true;
					order[v] = ++cnt;
					q.offer(v);
				}
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

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		} //Array로 가져오고 그 가져온 리스트에 더한다.

		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}

		order = new int[N + 1];
		visited = new boolean[N + 1];

		bfs(R);

		for (int i = 1; i <= N; i++) {
			bw.write(order[i] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
