import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA= new int[n];
        int[] arrB= new int[n];
        for(int i=0; i<n; i++){
            arrA[i]=sc.nextInt();
            arrB[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            System.out.println("Case #" + (i + 1) + ": " + (arrA[i] + arrB[i]));
        }
    }
}