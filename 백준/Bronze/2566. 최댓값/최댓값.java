import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int [][] arr1 = new int[9][9];
		
		for (int i=0;i<9;i++) {
			for (int j=0; j<9;j++) {
				int a = scanner.nextInt();
				arr1[i][j] = a;
			}
		}
		int max = 0;
		
		for (int i=0;i<9;i++) {
			for (int j=0; j<9;j++) {
				if (arr1[i][j]>max)
					max = arr1[i][j];
			}
		}
		
		ArrayList<String> aa = new ArrayList<>();
		for (int i=0;i<9;i++) {
			for (int j=0; j<9;j++) {
				if(arr1[i][j] == max)
					aa.add(String.format("%d\n%d %d\n", max, i+1, j+1));
			}
		}
		System.out.println(aa.get(0));
	}
}