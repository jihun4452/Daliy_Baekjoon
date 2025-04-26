import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sumY = 0;
        int sumM = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());

            sumY += ((n / 30) + 1) * 10; // 영식 요금제
            sumM += ((n / 60) + 1) * 15; // 민식 요금제
        }

        if (sumY < sumM) {
            System.out.println("Y " + sumY);
        } else if (sumY > sumM) {
            System.out.println("M " + sumM);
        } else {
            System.out.println("Y M " + sumY);
        }
    }
}
