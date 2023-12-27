import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(br.readLine());

StringBuilder d = new StringBuilder();

Deque <Integer> c = new LinkedList<>();

while(a-->0) {
String [] b = br.readLine().split(" ");
switch(b[0]) {
case "1":
	c.addFirst(Integer.parseInt(b[1]));
	break;
case "2":
	c.addLast(Integer.parseInt(b[1]));
	break;
case "3":
	d.append(c.isEmpty() ? -1 : c.poll()).append("\n");
	break;
case "4":
	d.append(c.isEmpty() ? -1 : c.pollLast()).append("\n");
	break;
case "5":
	d.append(c.size()).append("\n");
	break;
case "6":
	d.append(c.isEmpty() ? 1 : 0).append("\n");
	break;
case "7":
	d.append(c.isEmpty() ? -1 : c.peek()).append("\n");
	break;
case "8":
	d.append(c.isEmpty() ? -1 : c.peekLast()).append("\n");
	break;
}


}
System.out.println(d);
}

}