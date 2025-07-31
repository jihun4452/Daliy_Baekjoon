import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];

		DFS(1, 0);

		System.out.print(sb.toString());
	}

	public static void DFS(int start, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.setLength(sb.length() - 1);
			sb.append('\n');
			return;
		}
		for(int i=start; i<=N; i++){
			arr[depth] = i;
			DFS(i+1,depth+1);
		}
	}
}
