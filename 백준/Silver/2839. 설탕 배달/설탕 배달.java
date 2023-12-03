import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
	int b = 0;
	
	int min = a;
		for (int i=0; i<a+1;i+=5) {
			if ((a-i)%3==0) {
				b = (a-i)/3+i/5;
				if (min>b)
					min = b;
			}
		}
		if (min==a)
			System.out.println(-1);
		else
			System.out.println(min);
		}
}