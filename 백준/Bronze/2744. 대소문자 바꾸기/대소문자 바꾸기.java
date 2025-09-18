import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		//대문자라면 소문자로, 소문자라면 대문자로 배열
		StringBuilder sb = new StringBuilder();

		for(char c : st.toCharArray()) {
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
