import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line= br.readLine();
		int original= Integer.parseInt(line);
		int current= original;
		int count = 0;
		do {
			int tens = current / 10;
			int ones = current % 10;

			int sum = tens + ones;
			int newDigit = sum % 10;

			current = ones * 10 + newDigit;

			count++;
		} while (current != original);

		System.out.println(count);
	}
}