import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<N; i++){
			deque.offer(Integer.parseInt(st.nextToken()));
		}
		Deque<Integer> stack = new ArrayDeque<>();
		int expected= 1;

		while(!deque.isEmpty()||!stack.isEmpty()){
			if(!deque.isEmpty() && deque.peek()==expected){
				deque.poll();
				expected++;
			}else if(!stack.isEmpty() && stack.peek()==expected){
				stack.pop();
				expected++;
			}else if(!deque.isEmpty()){
				stack.push(deque.poll());
			}else {
				break;
			}
		}

		bw.write(expected == N + 1 ? "Nice" : "Sad");
		bw.flush();
		bw.close();
		br.close();
	}
}