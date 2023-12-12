import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String a = br.readLine();

int b = Integer.parseInt(a);

Stack g = new Stack();

StringBuilder f = new StringBuilder();

for (int i=0; i<b;i++) {
	char c [] = (br.readLine()).toCharArray();
	int d = 0;
	for (char e : c) {
		if (e == '(')
			d++;
		else if (e == ')')
			d--;
		if (d<0)
			break;
	}
	if (d==0)
		f.append("YES").append("\n");
	else
		f.append("NO").append("\n");
}
System.out.println(f);
	}
}