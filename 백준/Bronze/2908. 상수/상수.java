import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st= new StringTokenizer(br.readLine());

		String s1= st.nextToken();
		String s2= st.nextToken();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();

		int t1 = Integer.parseInt(sb.append(s1).reverse().toString());
		int t2 = Integer.parseInt(sb1.append(s2).reverse().toString());

		System.out.println(Math.max(t1, t2));
	}
}
