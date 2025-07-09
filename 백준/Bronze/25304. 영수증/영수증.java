import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int m = sc.nextInt();

		int[] result = new int[m];
		int[] arr = new int[m*2];
		int total = 0;
		for (int i = 0; i < m * 2; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			result[i] = (arr[i*2] * arr[i*2+1]);
		}

		for(int i= 0; i< m; i++){
			total += result[i];
		}

		if(total == price){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
