import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int answer = Integer.parseInt(br.readLine());

		for(int i = 0; i < answer; i++){
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a1= Integer.parseInt(st.nextToken());
			String s1= st.nextToken();
			for(int j = 0 ; j< s1.length(); j++){
				for (int k = 0; k < a1; k++) {
					bw.write(s1.charAt(j));
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}