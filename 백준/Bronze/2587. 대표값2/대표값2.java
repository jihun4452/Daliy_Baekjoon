import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] numbers = new int[5];

		int total=0;

		for(int i=0; i<5; i++){
			numbers[i]= sc.nextInt();
			total+=numbers[i];
		}
		int average= total/5;
		List<Integer> list= new ArrayList<>();
		for(int i=0; i<5; i++){
			list.add(numbers[i]);
		}

		Collections.sort(list);

		System.out.println(average);
		System.out.println(list.get(2));

	}
}