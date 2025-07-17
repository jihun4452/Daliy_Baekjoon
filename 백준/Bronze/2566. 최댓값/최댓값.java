import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[9][9];
		int maxI= -1;
		int maxJ= -1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int Max= Integer.MIN_VALUE;

		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(arr[i][j]>Max){
					Max= arr[i][j];
					maxI= i;
					maxJ= j;
				}
			}
		}
		System.out.println(Max);
		System.out.println((maxI+1)+" "+(maxJ+1));
	}
}