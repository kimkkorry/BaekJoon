import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();

Set<String> b = new HashSet<>();

for (int i=0; i<a;i++) {
	String c = scanner.next();
	String d = scanner.next();
if (d.equals("enter"))
	b.add(c);
else if (d.equals("leave"))
	b.remove(c);
}	
ArrayList<String> f = new ArrayList<>(b);
f.sort(Comparator.reverseOrder());

StringBuilder c = new StringBuilder();
for (int i=0; i<f.size();i++) {
		c.append(f.get(i)).append("\n");
}
System.out.println(c);
	}

}