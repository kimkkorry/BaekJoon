import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int d = scanner.nextInt();
	int e = scanner.nextInt();
	
	Integer b[] = new Integer[d];
	int c = 0;
	
		for (int i=0;i<d;i++) {
		int a = scanner.nextInt();
		b[i] = a;
		c+=a;
		}
	Arrays.sort(b, Collections.reverseOrder());
	
	System.out.println(b[e-1]);
	}
		
		}