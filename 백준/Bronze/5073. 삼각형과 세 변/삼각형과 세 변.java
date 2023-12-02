import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	if (a==0&&b==0&&c==0)
		break;
	else if (a==b&&b==c)
		System.out.println("Equilateral");
	else if (a>=b+c||b>=a+c||c>=a+b)
		System.out.println("Invalid");
	else if (a==b||a==c||b==c)
		System.out.println("Isosceles");
	else 
		System.out.println("Scalene");
	
	}
}
}