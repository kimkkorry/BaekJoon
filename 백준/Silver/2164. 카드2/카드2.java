import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String aa = br.readLine();
int a = Integer.parseInt(aa);

Queue b = new LinkedList<>();

for (int i=1; i<a+1;i++)
	b.offer(i);

while (b.size()!=1) {
	b.poll();
	Object c = b.poll();
	b.offer(c);
}
System.out.println(b.poll());
}
	

	}