import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, countRepaint(board, i, j, 'W'));
                answer = Math.min(answer, countRepaint(board, i, j, 'B'));
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int countRepaint(char[][] board, int si, int sj, char start) {
        int repaint = 0;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                char expected = ((x + y) % 2 == 0) ? start : (start == 'W' ? 'B' : 'W');
                if (board[si + x][sj + y] != expected) {
                    repaint++;
                }
            }
        }
        return repaint;
    }
}
