import java.io.*;
import java.util.*;

public class Main {
	static int w, h;
	static int[][] map;
	static boolean[][] visited;
	static final int[] dx = {-1,-1,-1, 0, 0, 1, 1, 1};
	static final int[] dy = {-1, 0, 1,-1, 1,-1, 0, 1}; //대각선 문제임, 대각선으로 탐색해야함

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken()); //wh가 00 이면 종료해야하니까..
			if (w == 0 && h == 0) break;

			map = new int[h][w];
			visited = new boolean[h][w];

			for (int i = 0; i < h; i++) { //일단.. 넣고 생각
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int islands = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						islands++;
					}
				}
			}
			sb.append(islands).append('\n');
		}
		System.out.print(sb);
	}

	static void bfs(int sx, int sy) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		visited[sx][sy] = true;
		q.offer(new int[]{sx, sy});

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0], y = cur[1];
			for (int dir = 0; dir < 8; dir++) { //대각선 양옆 순회, 그리고 범위 내에 있는지 봐야함
				int nx = x + dx[dir], ny = y + dy[dir];
				if (0 <= nx && nx < h && 0 <= ny && ny < w) {
					if (!visited[nx][ny] && map[nx][ny] == 1) {
						visited[nx][ny] = true;
						q.offer(new int[]{nx, ny});
					}
				}
			}
		}
	}
}
