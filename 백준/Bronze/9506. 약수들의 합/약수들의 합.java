import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
while(true) {
	int a = scanner.nextInt();
	if (a==-1)
		break;
	else {
	
	ArrayList<Integer> c = new ArrayList<>();
	int b = 0;
	for (int i=1; i<a;i++) {
		if (a%i==0) {
			c.add(i);
		b+=i;
		}
	}
	if (b != a) 
		System.out.printf("%d is NOT perfect.\n",a);
	else {
		String d = "";
		for (int i=0; i<c.size()-1;i++)
			d+= String.format("%d + ", c.get(i));
		d+=c.get(c.size()-1);
		System.out.printf("%d = %s\n", a, d);
	}
	}

}
}
}