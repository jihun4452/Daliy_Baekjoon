import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();

		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch(command) {
				case "push":
					int x = Integer.parseInt(st.nextToken());
					queue.addLast(x);
					break;
				case "pop":
					bw.write((queue.isEmpty()? -1: queue.pollFirst())+ "\n");
					break;
				case "size":
					bw.write(queue.size() + "\n");
					break;
				case "empty":
					bw.write((queue.isEmpty() ? 1 : 0) + "\n");
					break;
				case "front":
					bw.write((queue.isEmpty() ? -1 : queue.peekFirst()) + "\n");
					break;
				case "back":
					bw.write((queue.isEmpty() ? -1 : queue.peekLast()) + "\n");
					break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
