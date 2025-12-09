import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * 1. 세준이가 안녕 인사 해야한다. 사람들에게,
		 * 2. 세준이를 생각해준 사람 N명, 1 ~ N이다.
		 * 3. i번 사람에게 인사시, L[i] 체력 잃음, J[i] 기쁨을 얻음 동시에,
		 * 4. 각각 최대 한번까지만, 인사 한번
		 * 5. 체력은 100, 기쁨은 0이다.
		 * 6. 0 이거나, 음수일 경우 죽는다. 최대한 기쁨을 많이 받아야한다.
		 *
		 * 하나씩 치고 올라오면 금방 나올 수 있을 거 같음
		 *
		 * 1. 첫 줄은, 사람 수
		 * 2. 둘째 줄은, 잃는 체력이 1번 사람부터 순서대로
		 * 3. 셋째 줄은, 기쁨이 1번 사람부터
		 * 4. 출력은 최대 기쁨 수
		 * 5. 사람에게 인사하다가 죽으면, 그 사람의 기쁨은 얻을 수 없다. 첫 사람이 100일경우 건너 뛰어야함, 바로 죽음
		 */


		int N = Integer.parseInt(br.readLine());

		int[] hp = new int[N];
		int[] happy = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i < N; i++){
			hp[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i <N; i++){
			happy[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp =new int[100];

		for(int i =0; i<N; i++){
			int hp2 = hp[i];
			int joy = happy[i]; //인사와 기쁨

			for(int j=99; j>=hp2; j--){
				dp[j] = Math.max(dp[j], dp[j-hp2] + joy);
			} //1,21,79 가정 dp[99], dp[99-1] + 20;
		}
		System.out.println(dp[99]);
	}
}