import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            sb.append(s.charAt(0))
              .append(s.charAt(s.length() - 1))
              .append('\n');
        }

        System.out.print(sb.toString());
    }
}
