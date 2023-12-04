import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String z = scanner.next();
	
	String a = z.toUpperCase();
	
	ArrayList<String> c = new ArrayList<>();
	for (int i=0; i<a.length();i++) {
		int d = a.indexOf(a.charAt(i));
		c.add(a.charAt(d)+"");
	}
	Set<String> e = new HashSet<>(c);
	ArrayList<Integer> f  = new ArrayList<>();
	ArrayList<String> g = new ArrayList<>(e);
	
	for (int j=0; j<g.size();j++) {
		int b = 0;
		for (int i=0; i<c.size();i++) {
		if (g.get(j).equals(c.get(i))) {
			b+=1;
		}
	}
	f.add(b);	
	}
	int max = f.get(0);
	for (int i = 1; i<f.size();i++) {
		if (max <f.get(i))
			
			max = f.get(i);
	}
	f.add(0);
	
	ArrayList<String> as = new ArrayList<>();
	for (int i=0; i<f.size()-1;i++) {
		if (max == f.get(i)) {
			if (max == f.get(i+1))
				as.add("?");
			else
				as.add(g.get(f.indexOf(max)));
		}
	}
	if (as.size() == 1)
		System.out.println(as.get(0));
	else
		System.out.println("?");
}
}