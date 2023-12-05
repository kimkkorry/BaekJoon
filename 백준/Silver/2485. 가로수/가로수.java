import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a = scanner.nextInt();
	
	int aa[] = new int [a];
	for (int i=0; i<a;i++) {
		int b = scanner.nextInt();
		aa[i] = b;
	}
	int bb[] = new int [a-1];
	for (int i=1; i<aa.length;i++) {
		bb[i-1] = aa[i] - aa[i-1];
	}
	
	int c = bb[bb.length-1];
	int d = bb[0];
	int e = 0;
	
	while (true) {
		if (c%d==0) {
		e = d;
			break;
		
		}
		else {
			e = c;
			c = d;
			d = e%c;
		}
	}
	int f = e;
	int g = 0;
	int m = e;
	for (int i=0; i<bb.length;i++) {
		int h = bb[i];
		while (true) {
			if (h%f==0) {
				m = f;
				break;
			}
			else {
				g = h;
				h = f;
				f = g%h;
			}
		}
	}
	int n = 0;
	for (int i=0; i<bb.length;i++) {
		n += bb[i]/m;
	}
	System.out.println(n-bb.length);
	}
}