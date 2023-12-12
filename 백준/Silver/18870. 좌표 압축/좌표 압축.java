import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		Set <Integer> b = new HashSet<>();
		String bb [] = (br.readLine()).split(" ");
		int c [] = new int [a];
		
		for (int i=0; i<a;i++) {
			int d = Integer.parseInt(bb[i]);
			b.add(d);
			c[i] = d;
		}
		Integer [] e = b.toArray(new Integer[] {});
		Arrays.sort(e);
		StringBuilder f = new StringBuilder();
		for (int i= 0; i<a;i++) {
			f.append(Arrays.binarySearch(e, c[i])).append(" ");
		}
		System.out.println(f);
	}
	}