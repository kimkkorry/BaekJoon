import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException  {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int a = Integer.parseInt(br.readLine());

Stack st = new Stack();

StringBuilder d = new StringBuilder();

for (int i = 0; i<a;i++) {
	String[] b = (br.readLine()).split(" ");
	if (b.length == 2)
		st.push(b[1]);
	else {
		int c = Integer.parseInt(b[0]);
		if (c == 2)
			d.append(String.format("%s", !st.isEmpty() ? st.pop():-1)).append("\n");
		else if (c==3)
			d.append(st.size()).append("\n");
		else if (c==4)
			d.append(String.format("%s", st.isEmpty() ? 1:0)).append("\n");
		else if (c==5)
			d.append(String.format("%s", !st.isEmpty() ? st.get(st.size()-1):-1)).append("\n");
	}
}
System.out.println(d);
}
}