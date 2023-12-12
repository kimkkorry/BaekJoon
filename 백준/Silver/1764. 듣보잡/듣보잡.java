import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String a[] = (br.readLine()).split(" ");
int b = Integer.parseInt(a[0]);
int c = Integer.parseInt(a[1]);

Map<String, Integer> d = new  HashMap<>();

for (int i=0; i<b;i++) 
	d.put(br.readLine(), 1);
ArrayList<String> f = new ArrayList<>();
for (int i=0; i<c;i++) {
	String e = br.readLine();
	if (d.containsKey(e)) {
		f.add(e);
	}
	}
f.sort(Comparator.naturalOrder());

StringBuilder g = new StringBuilder();

g.append(f.size()).append("\n");

for (String h : f)
	g.append(h).append("\n");
System.out.println(g);
		
	}
}
