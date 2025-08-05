import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[][] visited;
	static int N;
	static int[][] height; // 물의 높이임

	public static void DFS(int x, int y, int water) {
		visited[x][y] = true; //방문 함
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i]; //상하좌우 전부 돌음
			if (nx >= 0 && nx < N && ny<N && ny >= 0&& !visited[nx][ny] &&height[nx][ny]>water) {
				DFS(nx, ny,water);
			}//범위 안에서만 돌게 놔둔다, 그 이상 이하는 안됨
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		height = new int[N][N];

		int maxH = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				height[i][j] = Integer.parseInt(st.nextToken());
				maxH = Math.max(maxH, height[i][j]);
			}//가장 높은 값을 일단 구함
		}
		int result = 1;
		for (int water = 0; water <= maxH; water++) { //최대로 잠기는 수까지만 반복
			visited = new boolean[N][N];
			int count = 0; //물에 잠기지 않는 수
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//아직 방문 X 그리고 물 높이보다 지대가 더 높다면 다른곳 본다
					if (!visited[i][j] && height[i][j] > water) {
						DFS(i, j,water);
						count++;
					}
				}
			}
			result = Math.max(result, count);
		}
		System.out.println(result);
		br.close();
	}
}

