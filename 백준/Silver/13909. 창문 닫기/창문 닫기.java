import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
long a = scanner.nextLong();

int b = 0;
for (int i=1; i<Math.sqrt(a)+1;i++) {
	if (i*i<=a)
		b++;
}
	System.out.println(b);
	}

}