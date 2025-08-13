import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase= Integer.parseInt(br.readLine());

		for(int i=0; i<testCase; i++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); //호
			int[][] dp = new int[k + 1][n + 1];

			for(int j=1; j<=n;j++){
				dp[0][j]=j;
			}

			for(int m=1; m<=k; m++){
				for(int j=1; j<=n; j++){
					if(j==1) dp[m][j]=1;
					else dp[m][j] = dp[m][j - 1] + dp[m - 1][j];
				}
			}
			System.out.println(dp[k][n]);
		}
	}
}
