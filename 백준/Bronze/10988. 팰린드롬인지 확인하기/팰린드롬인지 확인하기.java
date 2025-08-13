import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean isPalindrome = true;

        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        } //앞뒤가 같음

        System.out.println(isPalindrome ? 1 : 0);
    }
}
