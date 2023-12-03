import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int b[] = new int[5];
	int c = 0;
	
		for (int i=0;i<5;i++) {
		int a = scanner.nextInt();
		b[i] = a;
		c+=a;
		}
	Arrays.sort(b);
	System.out.println(c/5);
	System.out.println(b[2]);
	}
		
		}