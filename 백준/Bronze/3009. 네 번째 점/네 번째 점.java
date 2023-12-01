import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a	= scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int d = scanner.nextInt();
	int e = scanner.nextInt();
	int f = scanner.nextInt();
	
	int aa = 0;
	int bb = 0;
	int cc = 0;
	int dd = 0;
	int ee = 0;
	int ff = 0;
	
	if (a==c) {
		aa+=1;
		cc+=1;
	}
	if (a==e) {
		aa+=1;
		ee+=1;
	}
	if (c==e) {
		cc+=1;
		ee+=1;
	}
	
	if (b==d) {
		bb+=1;
		dd+=1;
	}
	if (b==f) {
		bb+=1;
		ff+=1;
	}
	if (d==f) {
		dd+=1;
		ff+=1;
	}
	String z = "";
	if (aa==0)
		z+=String.format("%d ", a);
	else if (cc==0)
		z+=String.format("%d ", c);
	else if (ee==0)
		z+=String.format("%d ", e);
	
	if (bb==0)
		z+=String.format("%d", b);
	else if (dd==0)
		z+=String.format("%d", d);
	else if (ff==0)
		z+=String.format("%d ", f);
		
	System.out.println(z);
	}
}