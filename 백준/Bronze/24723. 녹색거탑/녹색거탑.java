import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int classic = 2;
		int N= Integer.parseInt(br.readLine());

		int result = (int)Math.pow(classic, N);
		System.out.print(result);
	}
}