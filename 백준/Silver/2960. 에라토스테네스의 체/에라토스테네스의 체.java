import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		int a = scanner.nextInt();
		int d = scanner.nextInt();

		ArrayList<Integer> b = new ArrayList<>();
		for (int i=2; i<=a;i++)
b.add(i);
		
		ArrayList<Integer> e = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();
		outer:
		for (int i=b.get(0); i<=b.get(b.size()-1);i++) {
			c.add(i);
			for (int j = i; j<=b.get(b.size()-1);j+=i) {
			if (b.contains(j)) {
				b.remove(new Integer(j));
			e.add(j);
			}
			else
				continue;
			if (b.size()==0)
				break outer;
			}
		}
	System.out.println(e.get(d-1));
	}
	}
