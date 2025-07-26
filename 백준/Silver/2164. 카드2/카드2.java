import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();

		for(int i= 1; i<=n; i++){
			deque.addLast(i);
		}
		for(int i = 0; i<n-1; i++){
			deque.remove();
			if(!deque.isEmpty()){
				int temp= deque.pollFirst();
				deque.addLast(temp);
			}
		}
		bw.write(deque.peek()+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}