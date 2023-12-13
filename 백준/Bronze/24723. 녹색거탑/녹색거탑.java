import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt();

int b = 1;
for(int i = 1; i<a+1;i++) {
	b = b *2;
}
		System.out.println(b);
		
}
	}