import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<>();
		for (int i=2;i<500000;i++) {
			if (name(i))
				b.add(i);
		}
		
int n = scanner.nextInt();
for (int k=0; k<n;k++) {
		int a = scanner.nextInt();

int c = 0;

for (int i=0; i<=b.size(); i+=1) {
	if (b.get(i)>a/2)
		break;
	if (name(a-b.get(i)))
			c+=1;
	
	
}

System.out.println(c);
}
	}
	public static Boolean name(int a) {
		if (a<2)
			return false;
		else {
			for (int i=2; i<=Math.sqrt(a); i++) {
				if (a%i==0)
					return false;
			}
		}
		return true;
	}
	}