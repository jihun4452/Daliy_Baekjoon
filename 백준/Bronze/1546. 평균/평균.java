import static java.lang.Integer.*;
import java.util.Scanner;

public class Main {
	public static double solution(int N, int[] M){
		double[] box=new double[N];

		int MAX=MIN_VALUE;
		double total=0;

		for(int i=0; i<N; i++){
			if(M[i]>MAX){
				MAX=M[i];
			}
		}// 최대값 구하기 MAX가 이제 최대값

		for(int i=0; i<N;i++){
			box[i]=(double) M[i]*100/MAX;
		}

		for(int i=0; i<N; i++){
			total+=box[i];
		}

		return total/N;

	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt(); // 과목 수
		int[] M=new int[N];
		for(int i=0; i<N; i++) {
			M[i] = sc.nextInt();
		}

		System.out.println(solution(N,M));
	}
}