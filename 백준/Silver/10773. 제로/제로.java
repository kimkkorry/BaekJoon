import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException  {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int a = Integer.parseInt(br.readLine());

Stack st = new Stack();

int d = 0;

for (int i = 0; i<a;i++) {
	int b = Integer.parseInt(br.readLine());
if (b == 0)
	st.pop();
else
	st.push(b);	
}
while (!st.isEmpty())
	d+=(int) st.pop();



System.out.println(d);
}
}