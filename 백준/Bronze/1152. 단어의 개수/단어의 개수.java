import java.util.Scanner;

public class Main {
    public static int solution(String s){
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int count =1;
        for(char x: s.toCharArray()){
            if(x==' '){
                count +=1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();
        System.out.println(solution(text));
    }
}

