import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder b = new StringBuilder();
		while (true) {
		String a = br.readLine();
if (a.equals(".")) {
	break;
}
b.append(name(a)).append("\n");
		}
		System.out.println(b);
	}
	public static String name(String a) {
		char[] c = new char[a.length()];
		int d = 0;
		
		for (char e : a.toCharArray()) {
			if (e == '('||e=='[') {
				c[d] = e;
				d++;
			}
			else if (e == ')') {
				if (d == 0 || c[d-1] != '(') {
					return "no";
				}
				else
					d--;
			}
			else if (e == ']') {
				if(d==0||c[d-1]!= '[') {
					return "no";
				}
				else
					d--;
			}
		}
		if (d!=0) {
			return "no";
		}
		else
			return "yes";
	}
}