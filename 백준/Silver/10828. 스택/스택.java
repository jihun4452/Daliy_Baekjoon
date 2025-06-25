import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static String solution(int n, Scanner sc) {
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			String ans = sc.next();
			if (ans.equals("push")) {
				int m = sc.nextInt();
				stack.push(m);
			} else if (ans.equals("pop")) {
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
			} else if (ans.equals("size")) {
				sb.append(stack.size()).append('\n');
			} else if (ans.equals("empty")) {
				sb.append(stack.isEmpty() ? 1 : 0).append('\n');
			} else if (ans.equals("top")) {
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(solution(number, sc));
	}
}
