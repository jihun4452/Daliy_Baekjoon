import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n=sc.nextInt(); // 학생 수
		int m=sc.nextInt(); // 상을 받을 학생 수

		List<Integer> arrN = new ArrayList(n); // 학생 점수 저장
		for(int i=0;i<n;i++){
			arrN.add(sc.nextInt());
		}

		Collections.sort(arrN);

		int cutLine = arrN.get(n - m); // 커트라인 점수

		System.out.println(cutLine); // 커트라인 점수 출력
	}
}// 정렬 후에 커트라인 점수만 구하면 됨