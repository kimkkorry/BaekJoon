import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();

Set<Integer> b = new HashSet<>();

for (int i=0; i<a;i++)
	b.add(scanner.nextInt());

	StringBuilder c = new StringBuilder();
	
	int d = scanner.nextInt();
	
for (int i=0; i<d;i++) {
	int e = scanner.nextInt();
	if (b.contains(e))
		c.append(1).append(" ");
	else
		c.append(0).append(" ");
}
System.out.println(c);
	}

}