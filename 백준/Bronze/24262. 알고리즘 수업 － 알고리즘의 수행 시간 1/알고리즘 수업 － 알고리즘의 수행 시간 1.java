import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("1");
		bw.newLine();
		bw.write("0");
		bw.flush();
		bw.close();
		br.close();
	}
}