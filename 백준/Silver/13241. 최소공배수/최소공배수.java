import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	long a = scanner.nextLong();
	long b = scanner.nextLong();
	
	if (a%b==0) 
		System.out.println(a);
	else if (b%a==0)
		System.out.println(b);
	else if (a>b) {
		long c = b;
		long d = a%b;
		long e = 0 ;
		while (true) {
			if (c%d == 0)
				break;
			else {
				e = c;
				c = d;
				d = e%c;
			}
		}
		System.out.println((a/d)*(b/d)*d);
	}
	else if (b>a) {
		long c = a;
		long d = b%a;
		long e = 0 ;
		while (true) {
			if (c%d == 0)
				break;
			else {
				e = c;
				c = d;
				d = e%c;
			}
		}
		System.out.println((a/d)*(b/d)*d);
	}
	else
		System.out.println(a);
	}
}