import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;

		while((line = br.readLine()) != null) {
			if(line.equals(".")){
				break;
			}

			Stack<Character> stack = new Stack<>();
			boolean balanced= true;
			for(char c: line.toCharArray()){
				if(c== '(' || c== '['){
					stack.push(c);
				}else if(c == ')'){
					if(stack.isEmpty() || stack.pop() != '('){
						balanced = false;
						break;
					}
				}else if(c == ']'){
					if(stack.isEmpty() || stack.pop() != '['){
						balanced = false;
						break;
					}
				}
			}

			if(!stack.isEmpty()){
				balanced = false;
			}
			bw.write(balanced ? "yes\n" : "no\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
