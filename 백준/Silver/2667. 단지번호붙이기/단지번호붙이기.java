import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Point{
	int x, y;
	public Point(int x, int y){
		this.x= x;
		this.y=y;
	}
}
class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int N, answer;
	static int[][] board;

	public static void bfs(int x, int y) {
		Queue<Point> q= new LinkedList<>();
		q.offer(new Point(x,y));
		board[x][y]=0;
		while (!q.isEmpty()) {
			Point current = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = current.x + dx[i];
				int ny = current.y + dy[i];
				if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					q.offer(new Point(nx, ny));
					answer++;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st1.nextToken());

		board = new int[N+1][N+1];

		for (int i = 1; i <= N; i++) {
			String line= br.readLine();
			for (int j = 1; j <= N; j++) {
				board[i][j] = line.charAt(j-1)-'0';
			}
		}
		List<Integer> sizes = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (board[i][j] == 1) {
					answer = 1;
					bfs(i, j);
					sizes.add(answer);
				}
			}
		}
		Collections.sort(sizes);
		System.out.println(sizes.size());
		for (int s : sizes) {
			System.out.println(s);
		}
	}
}