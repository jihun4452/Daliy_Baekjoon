import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//배수와 약수, 약수면 factor, 배수면 multiple, 둘다 아니면 neither 값은 줄에 두개씩 주어진다. 마지막 줄은 0 0
		String[] input = br.readLine().split(" ");
		while (!input[0].equals("0") && !input[1].equals("0")) {
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			if (b % a == 0) {
				bw.write("factor\n");
			} else if (a % b == 0) {
				bw.write("multiple\n");
			} else {
				bw.write("neither\n");
			}
			input = br.readLine().split(" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
