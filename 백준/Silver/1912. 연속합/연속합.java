import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] a= new int[n];

		StringTokenizer st= new StringTokenizer(br.readLine());

		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp=new int[n];
		dp[0] = a[0];

		int ans =dp[0];

		for(int i= 1; i<n; i++){
			dp[i] = Math.max(a[i], dp[i-1] + a[i]); // 현재, 앞에거 더한뒤에 기존거랑 뭐가 더 큰지 비교
			ans = Math.max(ans,dp[i]); //가장 큰걸 비교, 
		}
		System.out.println(ans);
	}
}
