import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] arr = new String[10];

		arr[1] = "    ";
		arr[2] = "ABC ";
		arr[3] = "DEF ";
		arr[4] = "GHI ";
		arr[5] = "JKL ";
		arr[6] = "MNO ";
		arr[7] = "PQRS";
		arr[8] = "TUV ";
		arr[9] = "WXYZ";

		int total = 0;
		for(char c : s.toCharArray()) {

			for(int i=1; i<10; i++ ) {
				if(c == arr[i].charAt(0)) {
					total += i+1;
				}else if(c == arr[i].charAt(1)) {
					total += i+1;
				}else if(c == arr[i].charAt(2)) {
					total += i+1;
				}else if(c == arr[i].charAt(3)) {
					total += i+1;
				}
			}
		}
		System.out.println(total);

	}
}
