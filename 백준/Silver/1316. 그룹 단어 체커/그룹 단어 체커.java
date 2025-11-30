import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * 1. 그룹을 만들어야한다.
		 * 2. 뒤에 문자가 나오면 그룹이 아니다.
		 * 3. 그룹 Count 가 있어야한다.
		 * 4. 알파벳이니까 true로 접근해도 좋을 거 같음
		 */
		int N = Integer.parseInt(br.readLine());

		//문제를 바로 가지않고, 단일로 맞는지 확인
		String[] str = new String[N];
		for(int i = 0 ; i<N; i++){
			str[i] = br.readLine();
		}
		int sum = 0;
		for(int k = 0; k<N; k++) {
			boolean[] answer = new boolean[26];
			char[] ch = str[k].toCharArray();

			int count = 1;
			for (int i = 0; i < str[k].length(); i++) {
				if (answer[ch[i] - 'a'] == false) {
					answer[ch[i] - 'a'] = true;
					continue;
				}
				if (i > 0) {
					if (answer[ch[i] - 'a'] == true && ch[i - 1] != ch[i]) {
						count = 0;
						break;
					} else {
						continue;
					}
				}
			}
			sum +=count;
		}
		System.out.println(sum);
	}
}