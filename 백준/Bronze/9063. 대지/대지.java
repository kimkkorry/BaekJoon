import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a	= scanner.nextInt();
	int minx = 10001;
	int miny = 10001;
	int maxx = -10001;
	int maxy = -10001;
	for (int i=0;i<a;i++) {
		int b= scanner.nextInt();
		int c= scanner.nextInt();
		
		if (minx>b)
			minx = b;
		if (miny>c)
			miny = c;
		if (maxx<b)
			maxx = b;
		if (maxy<c)
			maxy = c;
	}
		System.out.println((maxx-minx)*(maxy-miny));
	}
}