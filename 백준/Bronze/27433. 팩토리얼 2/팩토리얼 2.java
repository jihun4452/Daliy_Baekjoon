import java.io.*;

public class Main {
	public static long Repactor(int n){
		long total = 0;
		if(n==0) return 1;
		else{
			total = n*(Repactor(n-1));
			return total;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		long result =Repactor(N);
		System.out.print(result);
	}
}
