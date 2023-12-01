import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a	= scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int d = scanner.nextInt();
	
	int min = a;
	if (d-b>=b) {
	if 	(min>b)
		min = b;
	}
	else {
		if (d-b<min)
			min = d-b;
	}
	
	if (c-a>=a) {
		if 	(min>a)
			min = a;
		}
		else {
			if (c-a<min)
				min = c-a;
		}
	
	System.out.println(min);
		
		

	}
}