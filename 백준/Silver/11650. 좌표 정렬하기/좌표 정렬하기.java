import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int [][] b = new int[a][2];
		for (int i=0; i<a;i++) {
			b[i][0] = scanner.nextInt();
			b[i][1] = scanner.nextInt();
		}

		Arrays.sort(b, (c1, c2) -> {
			if (c1[0] == c2[0])
				return c1[1] - c2[1];
			else
				return c1[0] - c2[0];
		});
		
		StringBuilder d = new StringBuilder();
		for (int i=0; i<a;i++)
			d.append(b[i][0]+" "+b[i][1]).append("\n");
		System.out.println(d);
	}
	}
