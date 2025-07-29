import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[] sequence;
	static boolean[] visited;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		sequence= new int[M];
		visited=new boolean[N+1];

		dfs(0);

		bw.flush();
		bw.close();
		br.close();
	}

	static void dfs(int depth) throws IOException{
		if (depth == M){
			for(int i= 0; i<M; i++){
				bw.write(sequence[i] + (i== M-1? "": " "));
			}
			bw.newLine();
			return;
		}
		for(int i=1; i<=N; i++){
			if(!visited[i]){
				visited[i] = true;
				sequence[depth] = i;
				dfs(depth+1);
				visited[i] = false;
			}
		}
	}
}
