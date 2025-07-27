import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());

		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int answer=Integer.parseInt(st.nextToken());

			if(answer==1){
				int t=Integer.parseInt(st.nextToken());
				deque.addFirst(t);
			}else if(answer==2){
				int t=Integer.parseInt(st.nextToken());
				deque.addLast(t);
			}else if(answer==3){
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.pollFirst() + "\n");
				}
			}else if(answer==4){
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.pollLast() + "\n");
				}
			}else if(answer==5){
				bw.write(deque.size() + "\n");
			}else if(answer==6){
				if (deque.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}else if(answer==7){
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekFirst() + "\n");
				}
			}else if(answer==8){
				if (deque.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(deque.peekLast() + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}