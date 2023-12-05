import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		long a = scanner.nextLong();
		
		for (long i=0;i<a;i++) {
			long b = scanner.nextLong();
			while(true) {
				if (name(b)) {
					System.out.println(b);
					break;
				}
				else
					b++;
			}
		}
	}
	public static Boolean name(long b) {
		if (b<2)
			return false;
		else {
			for (int i=2; i<=Math.sqrt(b);i++) {
				if (b%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	}