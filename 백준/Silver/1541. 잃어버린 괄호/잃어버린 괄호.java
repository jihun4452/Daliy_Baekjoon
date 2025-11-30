import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    /**
		 * 1. -면 모두 묶으면 된다.
		 * 2. +라면 안묶어도된다.
		 * 3. +, -로만 이어져있다.
		 * 4. 기호를 나눠야한다.
		 */
        String input = br.readLine();
        String[] minusSplit = input.split("-");

        int result = 0;

        result = sumPlus(minusSplit[0]);

        for (int i = 1; i < minusSplit.length; i++) {
            result -= sumPlus(minusSplit[i]);
        }

        System.out.println(result);
    }

    private static int sumPlus(String s) {
        String[] arr = s.split("\\+");
        int sum = 0;
        for (String num : arr) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
