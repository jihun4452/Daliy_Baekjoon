import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        int[] q = new int[N + 1];
        int head = 0, tail = 0;

        dist[0] = 0;
        q[tail++] = 0;

        while (head < tail) {
            int cur = q[head++];
            if (cur == N) break;

            int up = cur + 1;
            if (up <= N && dist[up] == -1) {
                dist[up] = dist[cur] + 1;
                q[tail++] = up;
            }

            int jump = cur + (cur / 2);
            if (jump <= N && dist[jump] == -1) {
                dist[jump] = dist[cur] + 1;
                q[tail++] = jump;
            }
        }

        if (dist[N] != -1 && dist[N] <= K) System.out.println("minigimbob");
        else System.out.println("water");
    }
}
