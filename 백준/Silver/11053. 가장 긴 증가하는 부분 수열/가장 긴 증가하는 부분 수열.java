import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n + 1];
		int[] arr = new int[n + 1];

		dp[0] = 1;
		int total = 0;
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1; i<= n; i++){
			dp[i] = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}//비교해서 값 넣음 123 시작시 2 일시, 1을 비교해서 값이 더 크니까 1+ 1 해주어야함 
			}
			total = Math.max(total, dp[i]);
		}

		System.out.print(total);
	}
}