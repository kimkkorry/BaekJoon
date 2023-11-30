import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
	
	int b = a/6;
	int c = a%6;
	
	int [] arr1 = new int [3];
	arr1[0] = 0;
	arr1[1] = 1;
	arr1[2] = 1;
	
	if (a==1) {
		arr1[2] = 0;
	}
	else if (a>=8&&a<=19) {
		arr1[0] = 1;
		arr1[1] = 3;
		arr1[2] = 2;
	}
	else if (a>19) {
	outer : 
	while (true) {
		for (int i=2;i<=b+1;i++) {
	if (arr1[1]<=b) {
	int e = arr1[1];
	arr1[2] = i;
	arr1[1] = arr1[2]+e;
	arr1[0] = e;
	}
	else 
		break outer;
	}
	}
	}
	
	if (a == 1){
		System.out.println(1);
	}
	else if (arr1[0]==b) {
		if (c<2)
			System.out.println(arr1[2]);
		else
			System.out.println(arr1[2]+1);
	}
	else if (arr1[1]>=b&&arr1[0]<b) {
		System.out.println(arr1[2]+1);
	}

}
}