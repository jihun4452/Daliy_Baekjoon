import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String[][] board;
    static int maxVal = Integer.MIN_VALUE;
    static int minVal = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new String[N][N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().split(" ");
        }

        dfs(0, 0, Integer.parseInt(board[0][0]), "+");
        System.out.println(maxVal + " " + minVal);
    }

    static void dfs(int x, int y, int curVal, String op) {
        if (x == N - 1 && y == N - 1) {
            maxVal = Math.max(maxVal, curVal);
            minVal = Math.min(minVal, curVal);
            return;
        }

        int[] dx = {1, 0};
        int[] dy = {0, 1};

        for (int dir = 0; dir < 2; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                String cell = board[nx][ny];
                if (cell.equals("+") || cell.equals("-") || cell.equals("*")) {
                    dfs(nx, ny, curVal, cell);
                } else {
                    int nextVal = calc(curVal, op, Integer.parseInt(cell));
                    dfs(nx, ny, nextVal, op);
                }
            }
        }
    }

    static int calc(int a, String op, int b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
        }
        return a;
    }
}
