import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int num	= scanner.nextInt();
	
	int c = 0;
	for (int i=0; i<num;i++) {
		int a = scanner.nextInt();
		
		ArrayList <Integer> b = new ArrayList<>();
		
		for (int j = 1; j<a+1;j++) {
			if (a%j == 0)
				b.add(i);
		}
		if (b.size() == 2)
			c+=1;
			
	}
	System.out.println(c);
	}
}