import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        int[] C = new int[M];
        for (int i = 0; i < M; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                deque.addLast(B[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            deque.addFirst(C[i]);
            sb.append(deque.removeLast()).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}