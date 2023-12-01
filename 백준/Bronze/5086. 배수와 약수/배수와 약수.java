import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	ArrayList<String> aa = new ArrayList<>();
	while (true) {	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	if (a==0&&b==0)
		break;
	int c = a%b;
	int d = b%a;
	if (c == 0) 
		aa.add("multiple");
	else if (d == 0)
		aa.add("factor");
	else 
		aa.add("neither");
	
	}
	for(int i=0; i<aa.size();i++)
		System.out.println(aa.get(i));
		}

}