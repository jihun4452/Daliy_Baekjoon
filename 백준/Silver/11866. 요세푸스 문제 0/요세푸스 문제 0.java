import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int killer = Integer.parseInt(st.nextToken());

		Deque<Integer> deque = new ArrayDeque<>();
		int[] arr = new int[n];
		for(int i= 1; i<=n; i++){
			deque.addLast(i);
		}
		//들여 보내고

		for(int i = 0; i < n; i++){
			for(int j = 0; j < killer-1; j++){
				int temp= deque.pollFirst();
				deque.addLast(temp);
			}
			arr[i]= deque.pollFirst();
		}
		String result = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", ","<", ">"));

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}
