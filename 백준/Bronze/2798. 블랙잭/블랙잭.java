import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int d=0;
		int e = 0;
		
		int card [] = new int [a];
		for (int i=0; i<a;i++) {
			int c = scanner.nextInt();
			card[i] = c;
		}
		for (int i=0; i<a;i++) {
			for (int j=i+1;j<a;j++) {
					for (int k=j+1; k<a;k++) {
							if (card[i]+card[j]+card[k]<=b) {
								e= card[i]+card[j]+card[k];
								if (e>d)
									d = e;
							}
						}
					}
					}	
		System.out.println(d);
}
}