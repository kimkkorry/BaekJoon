import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int n	= scanner.nextInt();
	int m = scanner.nextInt();
	
	int c = 0;
	ArrayList<Integer> aa = new ArrayList<>();
	for (int i=n; i<m+1;i++) {
		
		ArrayList <Integer> b = new ArrayList<>();
		
		for (int j = 1; j<i+1;j++) {
			if (i%j == 0)
				b.add(i);
		}
		if (b.size() == 2) {
			c+=i;
			aa.add(i);
		}
	}
	if (aa.size() == 0)
		System.out.println(-1);
	else {
		System.out.println(c);
		System.out.println(aa.get(0));
	}
	}
}