import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = 0;
		
		for (int i=a; i>=0;i--) {
			String c[]=(i+"").split("");
			int d = 0;
			for (int j=0; j<c.length;j++) 
				d += Integer.parseInt(c[j]);
			if (i+d==a)
				b = i;
		}
		System.out.println(b);
}
}