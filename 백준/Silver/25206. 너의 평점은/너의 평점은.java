import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalScore = 0, totalCredit = 0;

		for (int i = 0; i < 20; i++) {
			sc.next();                
			double credit = sc.nextDouble();
			String grade = sc.next();

			if (grade.equals("P")) continue;  

			double point;
			switch (grade) {
				case "A+":
					point = 4.5;
					break;
				case "A0":
					point = 4.0;
					break;
				case "B+":
					point = 3.5;
					break;
				case "B0":
					point = 3.0;
					break;
				case "C+":
					point = 2.5;
					break;
				case "C0":
					point = 2.0;
					break;
				case "D+":
					point = 1.5;
					break;
				case "D0":
					point = 1.0;
					break;
				default:      
					point = 0.0;
					break;
			}

			totalScore  += credit * point;
			totalCredit += credit;
		}

		System.out.printf("%.6f\n", totalScore / totalCredit);
	}
}