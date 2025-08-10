import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
		System.out.println((long) Math.sqrt(n));
	}
}