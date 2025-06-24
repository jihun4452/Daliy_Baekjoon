import java.util.*;

public class Main {
	public static int[] solution(int total){
		int[] count=new int[10];

		String str=Integer.toString(total);

		for(int i=0; i<str.length(); i++){
			int digit=str.charAt(i)-'0';
			count[digit]++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numberOne=sc.nextInt();
		int numberTwo=sc.nextInt();
		int numberThree=sc.nextInt();

		int total=numberOne*numberTwo*numberThree;

		int result[]= solution(total);
		for(int i =0; i<10; i++){
			System.out.println(result[i]);
		}
	}
}
