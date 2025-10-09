import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n= Integer.parseInt(br.readLine());

		int count = 0;
		for(int i=0; i<=n; i++){
			count += i;
		}
		System.out.println(count);
	}
}
