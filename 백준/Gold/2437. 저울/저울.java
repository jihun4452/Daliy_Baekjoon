import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] weights = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            weights[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(weights);

        long res = 1;
        for (long w : weights) {
            if (w > res) {
                break;
            }
            res += w;
        }

        System.out.println(res);
    }
}