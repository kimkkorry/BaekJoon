import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String arr [][] = new String [a][b];
		
		for (int i=0; i<a; i++) {
			String c = scanner.next();
			String arr1 [] = c.split("");
			for (int j=0;j<b;j++)
			arr[i][j] = arr1[j];
		}
		String arrB[][] = new String [8][8];
		String arrW[][] = new String [8][8];
		
			for (int i=0; i<8;i+=2) {
				for (int j=0; j<8;j+=2) {
					arrB[i][j] = "B";
					arrB[i+1][j+1] = "B";
					arrB[i][j+1] = "W";
					arrB[i+1][j] = "W";
				}
			}
		
	
			for (int i=0; i<8;i+=2) {
				for (int j=0; j<8;j+=2) {
					arrW[i][j] = "W";
					arrW[i+1][j+1] = "W";
					arrW[i][j+1] = "B";
					arrW[i+1][j] = "B";
				}
			}
		int bm=0;
		int wm = 0;
		int min = 33;
		int x = 0;
		int y=0;
		while (true) {
		bm =0;
		wm =0;
			if (x>=a-7) {
			x = 0;
			y+=1;
		}
			
		if (y>=b-7)
			break;
			
			for (int i=x;i<x+8;i++) {
			for (int j=y; j<y+8;j++) {
				if (!(arr[i][j].equals(arrW[i-x][j-y]))) 
					wm+=1;
				if (!(arr[i][j].equals(arrB[i-x][j-y])))
					bm+=1;
			}
		}
		if (wm <min)
			min = wm;
		if (bm<min)
			min = bm;
		x+=1;
		}
		System.out.println(min);
		}
}