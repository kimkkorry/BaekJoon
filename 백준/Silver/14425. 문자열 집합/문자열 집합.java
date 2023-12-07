import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();

Set<String> b = new HashSet<>();

int d = scanner.nextInt();

for (int i=0; i<a;i++)
	b.add(scanner.next());

	int c = 0;
	
	
for (int i=0; i<d;i++) {
	String e = scanner.next();
	if (b.contains(e))
		c+=1;
}
System.out.println(c);
	}

}