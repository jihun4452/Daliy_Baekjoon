import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] paper = new boolean[100][100];
        int n = sc.nextInt(), area = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            for (int dx = 0; dx < 10; dx++) {
                for (int dy = 0; dy < 10; dy++) {
                    if (!paper[x + dx][y + dy]) {
                        paper[x + dx][y + dy] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
