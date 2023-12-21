import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int [] b = new int [a];
	long c = 0;
	
	if (a==1) {
		int d = scanner.nextInt();
		c = d*d;
	}
	else {
		for (int i=0; i<a;i++) 
			b[i] = scanner.nextInt();
		Arrays.sort(b);
		int min = b[0];
		int max = b[a-1];
		c = min*max;
	}
	System.out.println(c);
}

}