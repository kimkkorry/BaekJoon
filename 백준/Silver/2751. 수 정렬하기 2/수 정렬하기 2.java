import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int b = scanner.nextInt();
	Integer [] a = new Integer[b];
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<b;i++) {
int c =  scanner.nextInt();
a[i] = c;
	}
	Arrays.sort(a);
		

	
	for (int i=0; i<b; i++) 

	sb.append(a[i]).append("\n");
	System.out.println(sb);
		}
}