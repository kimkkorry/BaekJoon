import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	long b = 0;
	for (int i=0; i<a;i++)
		b+=i;
	System.out.println(b);
	System.out.println(2);
	}
}