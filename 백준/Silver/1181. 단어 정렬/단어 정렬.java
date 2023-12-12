import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();

Set <String> b = new HashSet<>();
for (int i=0; i<a;i++) { 
	String e = scanner.next();
String f = "";
if (e.length()<10) {
	f+="0"+(e.length()+"");
	b.add(f+e);
}
else 
	b.add((e.length()+"")+e);
}
ArrayList<String> c = new ArrayList<>(b);

c.sort(Comparator.naturalOrder());

for (int i=0; i<c.size();i++) {
	String g = c.get(i);
	String h = g.substring(2, g.length());
	c.set(i, h);
}


StringBuilder d = new StringBuilder();

for (int i=0; i<c.size();i++) 
	d.append(c.get(i)).append("\n");
	
System.out.println(d);
}
	

	}