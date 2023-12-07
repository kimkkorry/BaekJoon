import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
String aaa = br.readLine();
String aaaa[] = aaa.split(" ");
		int a = Integer.parseInt(aaaa[0]);
int b = Integer.parseInt(aaaa[1]);

String bb[] = new String[a];
HashMap map = new HashMap();
for (int i=0; i<a;i++) {
	String bbb = br.readLine();
	map.put(bbb, i+1);
	bb[i] = bbb;
}

StringBuilder c = new StringBuilder();

for (int i=0; i<b;i++) {
	String d = br.readLine();
	if (map.containsKey(d))
		c.append(map.get(d)).append("\n");
	else {	
	int e = Integer.parseInt(d);
		c.append(bb[e-1]).append("\n");
	}
	
}
System.out.println(c);
	}

}