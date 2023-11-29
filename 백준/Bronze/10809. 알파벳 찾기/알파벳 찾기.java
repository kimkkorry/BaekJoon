import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

String a = scanner.next();

int [] d = new int[26];

for (int i = 0; i<26; i++) {
	char c = (char) (i+'a');
	String e = c+"";
		if (a.contains(e)) {

			d[i] += a.indexOf(c);
		}
		else
			d[i] += -1;
	}



for (int i=0; i<26;i++)
	System.out.printf("%d ", d[i]);
}
}
