import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
int a = scanner.nextInt();

int b = 0;
int c = 1;

while(true) {
	if ((c+"").contains("666"))
		b+=1;
	if (b == a) {
		System.out.println(c);
		break;
	}
	c+=1;
}
	}

}