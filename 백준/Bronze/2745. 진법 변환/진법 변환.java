import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String N = sc.next().toUpperCase(); //문자열
		int B= sc.nextInt(); //진수

		int len = N.length();

		int total = 0;
		for(int i =0; i< len; i++){
			char c = N.charAt(i);
			int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else {
				digit = c - 'A' + 10;
			}

			int exp = len - 1 - i;
			total += digit * (int)Math.pow(B, exp);
		}

		System.out.println(total);

	}
}