import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * 1. 제일 작은 종말은 666 이다.
		 * 2. 그 다음은 1666, 2666 ...
		 * 3. 처음은 666 이다. 2화부터 1666이다.
		 */
		int N = Integer.parseInt(br.readLine());

		//n = 1 출력시 666
		int count = 0;
		int number = 0;
		while(count < N){
			number++;
			if(String.valueOf(number).contains("666")){
				count++;
			}
		}
		System.out.println(number);
	}
}