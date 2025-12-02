import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * 1. 크로아티아 문자 치환
		 * 2. 아닌 문자는 넘어감
		 * 3. count++ 해주면 될거같음
		 * 4. replaceAll 사용해서 변환 해주면 될 거 같습니다.
		 * 5. 알파벳으로 받으니까 1로 변경해주면 될거같음.
		 */

		String str = br.readLine().replaceAll("c=", "1")
			.replaceAll("c-", "1")
			.replaceAll("dz=", "1")
			.replaceAll("d-", "1")
			.replaceAll("lj", "1")
			.replaceAll("nj", "1")
			.replaceAll("s=", "1")
			.replaceAll("z=", "1");

		System.out.println(str.toCharArray().length);
	}
}