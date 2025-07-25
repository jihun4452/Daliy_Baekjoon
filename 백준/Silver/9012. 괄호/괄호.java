import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String[] results = new String[n];

		for (int i = 0; i < n; i++) {
			String s1 = br.readLine();
			Stack<Character> stack = new Stack<>();
			String answer = "YES";
			for (char x : s1.toCharArray()) {
				if (x == '(') {
					stack.push(x);
				} else if (x == ')') {
					if (stack.isEmpty()) {
						answer = "NO";
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) {
				answer = "NO";
			}
			results[i] = answer;
		}
		for(String result : results) {
			bw.write(result);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}