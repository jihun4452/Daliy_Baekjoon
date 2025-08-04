import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N= Integer.parseInt(br.readLine());

		//입력값이 3 이면 7을 출력 다음 소수를 출력해야한다.
		for(int i=0; i<N; i++){
			long num = Long.parseLong(br.readLine()); //입력 받고
			long nextPrime = num;

			while (!BigInteger.valueOf(nextPrime).isProbablePrime(10)) nextPrime++;
			bw.write(nextPrime + "\n");
			// while(nextPrime <= MAX && isNotPrime[nextPrime]){
			// 	nextPrime++;
			// }//4일시 맥스보다 작아야하고, 값이 소수가 아니면 계속 증가 즉 1일시 증가 0을 만나면 빠져나간다.
			//
			// if(nextPrime > MAX) {
			// 	bw.write("\n");
			// } else {
			// 	bw.write(nextPrime + "\n");
			// }
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
