import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		boolean[] dp= new boolean[N + 1];

		if(N>=1){
			dp[1] = true;
		}
		if (N>= 2) {
			dp[2] = false;
		}
		if(N>= 3){
			dp[3] = true;
		}

		for(int i=4; i<=N; i++){
			boolean canWin = !dp[i-1];
			boolean canWin3 = i >= 3 && !dp[i-3];
			dp[i] = canWin || canWin3;
		}

		System.out.println(dp[N] ? "SK" : "CY");
	}
}
