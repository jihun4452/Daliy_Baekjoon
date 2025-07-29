import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N]; //첫 배열을 담습니다.

		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0; i< N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		} //첫번째 비교군

		int M=Integer.parseInt(br.readLine());
		int[] arr2=new int[M];
		StringTokenizer st2= new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++){
			arr2[i] = Integer.parseInt(st2.nextToken());
		} //두번째 비교군

		Arrays.sort(arr);

		for(int i=0; i <M; i++){
			int idx = Arrays.binarySearch(arr,arr2[i]);
			bw.write(idx>=0 ? "1\n" : "0\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

