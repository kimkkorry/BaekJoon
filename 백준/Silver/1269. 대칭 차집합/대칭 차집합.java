import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String a[] = (br.readLine()).split(" ");
int b = Integer.parseInt(a[0]);
int c = Integer.parseInt(a[1]);

Set<Integer> d = new HashSet<>();
Set<Integer> e = new HashSet<>();

String f[] = (br.readLine()).split(" ");
String g[] = (br.readLine()).split(" ");

for (int i=0; i<b;i++)
	d.add(Integer.parseInt(f[i]));
for (int i=0; i<c;i++)
	e.add(Integer.parseInt(g[i]));

int h=0;
for (Integer i : d) {
	if (!e.contains(i))
		h++;
}
for (Integer i : e) {
	if (!d.contains(i))
		h++;
}
		System.out.println(h);
	}
}