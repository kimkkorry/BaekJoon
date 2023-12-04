import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	long a = scanner.nextInt();
	long b = scanner.nextInt();
	long c = scanner.nextInt();
	long d = scanner.nextInt();
	
	long e = 0;
	if (b>d) {
	for (int i=1; i<=d;i++) {
		if (b%i==0&&d%i==0)
			e = i;
	}
	}
	else if (b<d) {
		for (int i=1; i<=b;i++) {
			if (b%i==0&&d%i==0)
				e = i;
		}
	}
	else if (b==d) {
		e = b;
	}
	long f = (b/e)*(d/e)*e;
long g = 0;
	g = f/b*a + f/d*c;
	long h = 0;
	if (g>f) {
		for (int i=1; i<=f;i++) {
			if (g%i==0&&f%i==0)
				h = i;
		}
		}
		else if (g<f) {
			for (int i=1; i<=g;i++) {
				if (g%i==0&&f%i==0)
					h = i;
			}
		}
		else if (g==f) {
			g = 1;
			f = 1;
		}
if (h!=1&&g!=1) {
	g = g/h;
	f = f/h;
}
System.out.println(g+" "+f);
	}
}