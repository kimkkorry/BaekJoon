import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b[][] = new String [a][2];
		
		for (int i=0; i<a;i++) {
			b[i][0] = scanner.next();
			b[i][1] = scanner.next();
		}
		Arrays.sort(b, (c1, c2) -> {
			return Integer.parseInt(c1[0]) - Integer.parseInt(c2[0]);
		});
		
		StringBuilder d = new StringBuilder();
		for (int i = 0; i<a;i++) 
			d.append(b[i][0]).append(" ").append(b[i][1]).append("\n");
		System.out.println(d);
	}
	}