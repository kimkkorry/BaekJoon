import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	
	ArrayList<Integer> c = new ArrayList<>();
	
	for (int i=1; i<a+1;i++) {
		if (a%i==0)
			c.add(i);
	}
	if (c.size()<b)
		System.out.println(0);
	else
		System.out.println(c.get(b-1));
	
	}

}