import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
while (true) {

	int a = scanner.nextInt();
if (a == 0)
	break;
else {
int b = 0;
	for (int i=a+1; i<=a*2; i++) {
	if (name(i)) 
		b+=1;;
	
}
	System.out.println(b);
}
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