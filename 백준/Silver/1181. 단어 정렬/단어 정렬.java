import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n = sc.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		Arrays.sort(arr, (s1, s2) -> {
			if (s1.length() != s2.length()) {
				return s1.length() - s2.length();
			} else {
				return s1.compareTo(s2);
			}
		});

		Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

		for(String s: set){
			System.out.println(s);
		}
	}
}