import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	long a = scanner.nextInt();
	
	long b = (a*(a-1)*(a-2))/6;
	System.out.println(b);
	System.out.println(3);
	}
}