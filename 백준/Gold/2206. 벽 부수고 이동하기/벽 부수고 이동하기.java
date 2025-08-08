import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class State {
	int x, y, broke, dist;
	State(int x, int y, int broke, int dist) {
		this.x = x; this.y = y;
		this.broke = broke; // 0: 아직 부순 적 없음, 1:부숨
		this.dist = dist;
	}
}

class Main {
	static int[][] board;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};

	static int N,M;

	public static void bfs(int x, int y){
		boolean[][][] visited = new boolean[N+1][M+1][2];

		Queue<State> q= new LinkedList<>();
		q.offer(new State(1,1,0,1));
		visited[1][1][0] = true;
		while(!q.isEmpty()){
			State s = q.poll();
			if(s.x == N && s.y == M){
				System.out.println(s.dist);
				return;
			}
			for(int d=0; d<4; d++){
				int nx = s.x + dx[d], ny = s.y + dy[d];
				if(nx<1||nx>N||ny<1||ny>M) continue;

				// 다음 칸이 벽이고, 아직 벽을 안 부순 상태라면
				if(board[nx][ny] == 1 && s.broke == 0 && !visited[nx][ny][1]) {
					visited[nx][ny][1] = true;
					q.offer(new State(nx, ny, 1, s.dist+1));
				}
				else if(board[nx][ny] == 0 && !visited[nx][ny][s.broke]) {
					visited[nx][ny][s.broke] = true;
					q.offer(new State(nx, ny, s.broke, s.dist+1));
				}
			}
		}
		System.out.println(-1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		board = new int[N+1][M+1];
		for(int i = 1; i <= N; i++){
			String s = br.readLine();
			for(int j = 1; j <= M; j++){
				board[i][j] = s.charAt(j-1) - '0';
			}
		}

		bfs(1,1);
	}
}
