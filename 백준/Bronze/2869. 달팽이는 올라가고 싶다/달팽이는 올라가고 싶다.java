import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	int d = (c-b)/(a-b);
	int e = (c-b)%(a-b);
	
	if (e>0)
		System.out.println(d+1);
	else if (e==0)
		System.out.println(d);
	
	
}
}