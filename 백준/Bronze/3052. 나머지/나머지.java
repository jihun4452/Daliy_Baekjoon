import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			list.add(arr[i] %42);
		}
		Set<Integer> set = new HashSet<>(list);
		List<Integer> newList = new ArrayList<>(set);
		System.out.println(newList.size());
	}
}