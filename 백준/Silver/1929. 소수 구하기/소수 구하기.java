import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st= new StringTokenizer(br.readLine());
		int m= Integer.parseInt(st.nextToken()); //이건 시작점 값
		int n= Integer.parseInt(st.nextToken()); //이건 배열의 크기 만큼 생성 +1 을 해주어야 그 번호까지 배열이 생성됨

		int[] ch= new int[n+1];

		if(n >=1) ch[1] =1;
		for(int i=4; i<=n; i+=2){
			ch[i] = 1;
		}

		for(int i=2; i<=n; i++){
			if(i>=m && ch[i] == 0){
				bw.write(i + "\n");
			}
			if(ch[i] == 0){
				for(int j=i; j<=n; j+=i){
					ch[j] = 1; 
				}
			}
		}
		// for(int i= m; i<=n; i++){
		// 	if(ch[i] == 0 && i != 1){ // 1은 과 2의 배수는 소수 x 2랑 0
		// 		bw.write(i + "\n");
		// 		for(int j= i; j<=n; j+=i){
		// 			ch[j] = 1;
		// 		}
		// 	}
		// }
		bw.flush();
		bw.close();
		br.close();
	}
}
