import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int M = sc.nextInt();

		int[] NumberBucket=new int[N+1];

		for(int i=0; i<M; i++){
			int first= sc.nextInt();
			int second=sc.nextInt();
			int third=sc.nextInt();

			for(int idx= first; idx<=second; idx ++){
				NumberBucket[idx]=third;
			}
		}

		for(int result=1; result<=N; result++ ){
			System.out.print(NumberBucket[result] + " ");
		}
	}
}
