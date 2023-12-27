import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
int b = scanner.nextInt();

StringBuilder d = new StringBuilder();

Queue <Integer> c = new LinkedList<>();

for (int i=0; i<a;i++)
	c.add(i+1);

d.append("<");

while(c.size()>1) {
	for (int i=1; i<b;i++)
		c.offer(c.poll());
	
	d.append(c.poll()).append(", ");
}
	d.append(c.poll()).append(">");
	
	System.out.println(d);

}

}
	