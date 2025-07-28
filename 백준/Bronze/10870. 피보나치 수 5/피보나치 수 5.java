import java.io.*;

public class Main {
	public static int solution(int n){
		int total = 0;

		if (n<0) return 0;
		else if(n == 0 || n ==1){
			return n;
		}else{
			total =solution(n-1) + solution(n-2);
		}

		return total;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int result =solution(N);
		System.out.print(result);
	}
}
