import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        int n2=number/4;

        for(int i=0; i<n2; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}