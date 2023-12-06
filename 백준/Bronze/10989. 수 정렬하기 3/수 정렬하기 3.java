import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		int a = Integer.parseInt(br.readLine());
		
		int [] b = new int [10000];
		
		for (int i=0; i<a;i++) {
			int c = Integer.parseInt(br.readLine());
			b[c-1] +=1;
		}
		StringBuilder d = new StringBuilder();
		
		for (int i=0; i<b.length;i++) {
			if (b[i]!=0) {
				for (int j=0; j<b[i];j++)
					d.append(i+1).append("\n");
			}
		}
		System.out.println(d);
	}
	}