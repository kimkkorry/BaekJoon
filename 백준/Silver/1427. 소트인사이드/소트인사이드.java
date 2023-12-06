import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String b = scanner.next();
	String [] a = b.split("");
	
	Arrays.sort(a, Collections.reverseOrder());

	String c = "";
	for (int i=0; i<a.length;i++)
		c+=a[i];
	System.out.println(c);
		}
}