import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		//재민이는 회식 장부 관리중, 재현이는 재민이를 도와준다.
		//재현이는 실수로 사고를 쳤다. 재현이는 잘못된 수를 부를때 0을 외쳐서 최근에 재민이가 쓴 수를 지운다.
		//재민이는 이렇게 모든 수를 받고 그 수의 합을 구한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int k= 0;

		for(int i= 0; i<n; i++){
			int x = Integer.parseInt(br.readLine());
			if(x == 0){
				k--;
			} else {
				arr[k++] = x;
			}
		}

		int total= 0;
		for(int i= 0; i<k; i++){
			total+=arr[i];
		}
		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
		br.close();

	}
}