import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	int a = scanner.nextInt();
    int b=2;
    int c=2;
    int d =3;
    if(a==1){
        System.out.println("1/1");
    }else{
        while(a>d){
            b++;
            c=d+1;
            d = d+b;
        }
        if(b%2==0){
            c= a-c+1;
            d= d-a+1;
        }else{
            int e = c;
        	c=d-a+1;
            d=a-e+1;
        }
        System.out.printf("%d/%d",c,d);
        }
}
}