import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int MAX = Integer.MIN_VALUE;
		int MIN = Integer.MAX_VALUE;

		int Number = sc.nextInt();

		for(int i = 1; i<= Number; i++){
			int value=sc.nextInt();
			if(value > MAX){
				MAX=value;
			}

			if(value <MIN){
				MIN=value;
			}
		}

		System.out.print(MIN+" "+MAX);
	}
}
