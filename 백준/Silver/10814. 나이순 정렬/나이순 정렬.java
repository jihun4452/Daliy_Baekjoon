import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		TreeMap<Integer, List<String>> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();

			map.computeIfAbsent(age, k -> new ArrayList<>())
				.add(name);
		}

		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
			int age = entry.getKey();
			for (String name : entry.getValue()) {
				System.out.println(age + " " + name);
			}
		}
	}
}
