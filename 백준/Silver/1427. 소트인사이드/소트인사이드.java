import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();
		char[] x= n.toCharArray();

		Arrays.sort(x);

		for(int i=0,j=x.length-1; i<j; i++, j--){
			char temp = x[i];
			x[i] = x[j];
			x[j] = temp;
		}

		bw.write(x);
		bw.flush();
		bw.close();
	}
}