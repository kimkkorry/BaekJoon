import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int num = scanner.nextInt();
	int arr[] = new int[num];
	int cc=0;
	
	for (int q = 0; q<num;q++) {
	int a = scanner.nextInt();
	int aa = scanner.nextInt();
	int aaa = scanner.nextInt();
	int b = scanner.nextInt();
	int bb = scanner.nextInt();
	int bbb = scanner.nextInt();
	int aabb = aaa+bbb;
	int ab = Math.abs(aaa-bbb);
	
	double d = Math.sqrt(Math.pow(b-a, 2)+Math.pow(bb-aa, 2));
	int e = 0;
	if (d==0&&aaa==bbb)
		e += -1;
	else if (d==aabb||d==ab)
		e+=1;
	else if (d>aabb||d<ab)
		e=0;
	else 
		e+=2;
	
	arr[cc] = e;
	cc++;
	}
	for(int i=0; i<num;i++)
		System.out.println(arr[i]);
	}

}